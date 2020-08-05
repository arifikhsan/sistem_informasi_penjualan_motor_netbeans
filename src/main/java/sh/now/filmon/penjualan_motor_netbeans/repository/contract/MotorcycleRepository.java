package sh.now.filmon.penjualan_motor_netbeans.repository.contract;

import sh.now.filmon.penjualan_motor_netbeans.model.Motorcycle;

import java.util.ArrayList;

public interface MotorcycleRepository {

    ArrayList<Motorcycle> getMotorcycles();

    Motorcycle getOne(Integer id);

    void add(Motorcycle motorcycle);

    void update(Motorcycle motorcycle);

    void delete(Integer id);
}
