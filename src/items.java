public class items {
    double price;
    String id;
    String item;

    public items(int price, String name, String item) {
        this.price = price;
        this.id = name;
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return id;
    }

    public void setName(String name) {
        this.id = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    @Override
    public String toString() {
        return "items{" +
                "price=" + price +
                ", id='" + id + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
