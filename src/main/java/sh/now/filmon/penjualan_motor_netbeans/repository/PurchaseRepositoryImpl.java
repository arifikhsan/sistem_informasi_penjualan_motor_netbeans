package sh.now.filmon.penjualan_motor_netbeans.repository;

import sh.now.filmon.penjualan_motor_netbeans.model.Customer;
import sh.now.filmon.penjualan_motor_netbeans.model.Motorcycle;
import sh.now.filmon.penjualan_motor_netbeans.model.Purchase;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.PurchaseRepository;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class PurchaseRepositoryImpl implements PurchaseRepository {
    public Connection connection;
    public Statement statement;
    public ResultSet resultSet;

    public PurchaseRepositoryImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/netbeans_penjualan_motor", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public ArrayList<Purchase> getPurchases() {
        ArrayList<Purchase> list = new ArrayList<>();
        try {
            resultSet = statement.executeQuery("SELECT " +
                    "penjualan.id AS id, pembeli.id AS id_pembeli, pembeli.nama AS nama_pembeli, " +
                    "motor.id AS id_motor, motor.nama AS nama_motor, penjualan.tanggal " +
                    "FROM penjualan " +
                    "INNER JOIN motor ON penjualan.motor_id = motor.id " +
                    "INNER JOIN pembeli ON penjualan.pembeli_id = pembeli.id");
            while (resultSet.next()) {
                list.add(new Purchase(
                                resultSet.getInt("id"),
                                new Motorcycle(
                                        resultSet.getInt("id_motor"),
                                        resultSet.getString("nama_motor")
                                ),
                                new Customer(
                                        resultSet.getInt("id_pembeli"),
                                        resultSet.getString("nama_pembeli")
                                ),
                                resultSet.getString("tanggal")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Purchase getOne(Integer id) {
        try {
            resultSet = statement.executeQuery("SELECT " +
                    "penjualan.id AS id, pembeli.id AS id_pembeli, pembeli.nama AS nama_pembeli, " +
                    "motor.id AS id_motor, motor.nama AS nama_motor, penjualan.tanggal " +
                    "FROM penjualan " +
                    "INNER JOIN motor ON penjualan.motor_id = motor.id " +
                    "INNER JOIN pembeli ON penjualan.pembeli_id = pembeli.id " +
                    "WHERE penjualan.id = " + id);
            if (resultSet.next()) {
                return new Purchase(
                        resultSet.getInt("id"),
                        new Motorcycle(
                                resultSet.getInt("id_motor"),
                                resultSet.getString("nama_motor")
                        ),
                        new Customer(
                                resultSet.getInt("id_pembeli"),
                                resultSet.getString("nama_pembeli")
                        ),
                        resultSet.getString("tanggal")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void add(Purchase purchase) {
        try {
            String query = String.format("INSERT INTO `penjualan` (`pembeli_id`, `motor_id`, `tanggal`) " +
                    "VALUES (%d, %d, '%s')", purchase.customer.getId(), purchase.customer.getId(), purchase.getDate());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Purchase purchase) {
        try {
            String query = String.format("UPDATE penjualan SET " +
                    "`pembeli_id` = %d, `motor_id` = %d, `tanggal` = '%s' " +
                    "WHERE id = %d", purchase.customer.getId(), purchase.motorcycle.getId(), purchase.getDate(), purchase.getId());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            String query = String.format("DELETE FROM penjualan WHERE id = %d", id);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
