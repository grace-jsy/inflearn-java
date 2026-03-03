package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("The cart is full.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("Display cart items");
        for(int i = 0; i <itemCount; i++) {
            Item item = items[i];
            System.out.println("Item: " + item.getName() + ", Total Price: " + item.getTotalPrice());
        }
        System.out.println("Total Price: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
