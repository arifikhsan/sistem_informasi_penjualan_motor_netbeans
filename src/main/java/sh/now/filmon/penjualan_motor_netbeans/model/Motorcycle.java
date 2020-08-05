package sh.now.filmon.penjualan_motor_netbeans.model;

public class Motorcycle {
    public Integer id;
    public String name;
    public String policeNumber;
    public Integer price;

    public Motorcycle(Integer id) {
        this.id = id;
    }

    public Motorcycle(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Motorcycle(String name, String policeNumber, Integer price) {
        this.name = name;
        this.policeNumber = policeNumber;
        this.price = price;
    }

    public Motorcycle(Integer id, String name, String policeNumber, Integer price) {
        this.id = id;
        this.name = name;
        this.policeNumber = policeNumber;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliceNumber() {
        return policeNumber;
    }

    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", policeNumber='" + policeNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
