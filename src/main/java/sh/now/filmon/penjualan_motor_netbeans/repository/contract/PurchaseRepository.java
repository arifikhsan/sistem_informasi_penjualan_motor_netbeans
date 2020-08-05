package sh.now.filmon.penjualan_motor_netbeans.repository.contract;

import sh.now.filmon.penjualan_motor_netbeans.model.Purchase;

import java.util.ArrayList;

public interface PurchaseRepository {

    ArrayList<Purchase> getPurchases();

    Purchase getOne(Integer id);

    void add(Purchase purchase);

    void update(Purchase purchase);

    void delete(Integer id);
}
