public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        store.addProduct(new Product(1, "Макароны", 50.0, "Макфа", 4.5));
        store.addProduct(new Product(2, "Шоколад", 300.0, "Ritter Sport", 4.8));
        store.addProduct(new Product(3, "Пиво Kriek", 320.0, "Medovarus", 5.0));

        Console console = new Console(store);
        console.run();
    }
}