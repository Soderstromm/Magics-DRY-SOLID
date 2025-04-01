import java.util.List;
import java.util.Scanner;

public class Console {

    private final Store store;
    private final Cart cart = new Cart();
    private final Scanner scanner = new Scanner(System.in);

    private boolean isRun = true;

    public Console(Store store) {
        this.store = store;
    }

    public void run() {
        while (isRun) {
            System.out.println("1. Просмотреть товары\n2. Фильтрация\n3. Добавить в корзину\n0. Выйти");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Сброс буфера

            switch (choice) {
                case 1 -> showAllProducts();
                case 2 -> applyFilter();
                case 3 -> addToCart();
                case 0 -> isRun = false;
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private void showAllProducts() {
        printProducts(store.getAllProducts());
    }

    private void applyFilter() {
        System.out.println("Введите макс. цену (например, '100')");
        String criteria = scanner.nextLine();
        List<Product> filtered = store.filter(new PriceFilter(), criteria);
        printProducts(filtered);
    }

    private void addToCart() {
        System.out.println("Введите ID товара:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Product product = store.getAllProducts().stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Товар не найден"));

        cart.addProduct(product);
        System.out.println("Товар добавлен в корзину!");
    }

    private void printProducts(List<Product> products) {
        products.forEach(p -> System.out.printf(
                "id: %d, Наименование: %s, Цена: %.2f, Производитель: %s%n",
                p.getId(), p.getName(), p.getPrice(), p.getManufacturer()
        ));
    }
}
