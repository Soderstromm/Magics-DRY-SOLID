import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private final int orderId;
    private final List<Product> products;
    private String status;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.status = "В обработке";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format(
                "Заказ #%d (Статус: %s)%nТовары:%n%s",
                orderId,
                status,
                products.stream().map(Product::toString).collect(Collectors.joining("\n"))
        );
    }
}
