public class Product {
    public static final double MAX_RATING = 5.0;
    private final int id;
    private final String name;
    private final double price;
    private final String manufacturer;
    private double rating;

    public Product(int id, String name, double price, String manufacturer, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getRating() {
        return rating;
    }
}
