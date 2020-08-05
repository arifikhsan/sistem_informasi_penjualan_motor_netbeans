package sh.now.filmon.penjualan_motor_netbeans.repository.contract;

import sh.now.filmon.penjualan_motor_netbeans.model.Customer;

import java.util.ArrayList;

public interface CustomerRepository {

    ArrayList<Customer> getCustomers();

    Customer getOne(Integer id);

    void add(Customer customer);

    void update(Customer customer);

    void delete(Integer id);
}
