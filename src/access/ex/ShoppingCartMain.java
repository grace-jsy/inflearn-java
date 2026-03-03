package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Kimbap", 2000, 2);
        Item item2 = new Item("Ramen", 3000, 3);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
