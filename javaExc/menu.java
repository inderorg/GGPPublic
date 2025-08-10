import java.util.ArrayList

public class Menu{
    static class Dish{
        String name;
        Double price;

        Dish(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
    public static void main(String[] args){
        ArrayList<Dish> menu = new ArrayList<>();
        menu.add(new Dish("pizza", 400));
        menu.add(new Dish("pasta", 300));

        double total = 0;
        for ( Dish dish : menu ) {
            total += dish.price;
        }

        System.out.println("Total: $" + total);
    }
}