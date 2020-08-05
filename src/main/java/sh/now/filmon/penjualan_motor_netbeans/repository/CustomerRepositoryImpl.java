package sh.now.filmon.penjualan_motor_netbeans.repository;

import sh.now.filmon.penjualan_motor_netbeans.model.Customer;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.CustomerRepository;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class CustomerRepositoryImpl implements CustomerRepository {
    public Connection connection;
    public Statement statement;
    public ResultSet resultSet;

    public CustomerRepositoryImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/netbeans_penjualan_motor", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            resultSet = statement.executeQuery("SELECT * from pembeli");
            while (resultSet.next()) {
                list.add(new Customer(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getString("alamat"), resultSet.getString("nomor_hp")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Customer getOne(Integer id) {
        try {
            resultSet = statement.executeQuery("SELECT * FROM pembeli WHERE id = " + id);
            if (resultSet.next()) {
                return new Customer(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getString("alamat"), resultSet.getString("nomor_hp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void add(Customer customer) {
        try {
            String query = String.format("INSERT INTO pembeli (`nama`, `alamat`, `nomor_hp`) " +
                    "VALUES ('%s', '%s', '%s')", customer.getName(), customer.getAddress(), customer.getPhoneNumber());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Customer customer) {
        try {
            String query = String.format("UPDATE `pembeli` SET " +
                    "`nama` = '%s', `alamat` = '%s', `nomor_hp` = '%s' " +
                    "WHERE id = %d", customer.getName(), customer.getAddress(), customer.getPhoneNumber(), customer.getId());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            String query = String.format("DELETE FROM pembeli WHERE id = %d", id);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
