package sh.now.filmon.penjualan_motor_netbeans.model;

public class Purchase {
    public Integer id;
    public Motorcycle motorcycle;
    public Customer customer;
    public String date;

    public Purchase(Integer id, Motorcycle motorcycle, Customer customer, String date) {
        this.id = id;
        this.motorcycle = motorcycle;
        this.customer = customer;
        this.date = date;
    }

    public Purchase(Motorcycle motorcycle, Customer customer, String date) {
        this.motorcycle = motorcycle;
        this.customer = customer;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", motorcycle=" + motorcycle +
                ", customer=" + customer +
                ", date='" + date + '\'' +
                '}';
    }
}
