package sh.now.filmon.penjualan_motor_netbeans.repository;

import sh.now.filmon.penjualan_motor_netbeans.model.Motorcycle;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.MotorcycleRepository;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class MotorcycleRepositoryImpl implements MotorcycleRepository {
    public Connection connection;
    public Statement statement;
    public ResultSet resultSet;

    public MotorcycleRepositoryImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/netbeans_penjualan_motor", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public ArrayList<Motorcycle> getMotorcycles() {
        ArrayList<Motorcycle> list = new ArrayList<>();
        try {
            resultSet = statement.executeQuery("SELECT * from motor");
            while (resultSet.next()) {
                list.add(new Motorcycle(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getString("nomor_polisi"), resultSet.getInt("harga")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Motorcycle getOne(Integer id) {
        try {
            resultSet = statement.executeQuery("SELECT * FROM motor WHERE id = " + id);
            if (resultSet.next()) {
                return new Motorcycle(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getString("nomor_polisi"), resultSet.getInt("harga"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void add(Motorcycle motorcycle) {
        try {
            String query = String.format("INSERT INTO motor (`nama`, `nomor_polisi`, `harga`) " +
                    "VALUES ('%s', '%s', %d)", motorcycle.getName(), motorcycle.getPoliceNumber(), motorcycle.getPrice());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Motorcycle motorcycle) {
        try {
            String query = String.format("UPDATE `motor` SET " +
                    "`nama` = '%s', `nomor_polisi` = '%s', `harga` = '%d' " +
                    "WHERE id = %d", motorcycle.getName(), motorcycle.getPoliceNumber(), motorcycle.getPrice(), motorcycle.getId());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            String query = String.format("DELETE FROM motor WHERE id = %d", id);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
