class Restaurant {
    String restaurant_name;

    void showMenu()
    {
        System.out.println("Restaurant Name: " + restaurant_name);
        System.out.println("----- Beverage Menu -----");
        System.out.println("1. Cold Drinks");
        System.out.println("2. Mojito");
        System.out.println("3. Tea");
        System.out.println("4. Juice");
        System.out.println("5. Shakes");
        System.out.println("6. Cold/HotCoffee");
    }
}
class VegRestaurant extends Restaurant
{
    void vegSpecialMenu()
    {
        System.out.println("----- Veg Special Menu -----");
        System.out.println("1. Paneer Butter Masala" );
        System.out.println("2. Veg Biryani ");
        System.out.println("3. Dal Makhani ");
        System.out.println("4. Pizza ");
        System.out.println("5. Pasta ");
        System.out.println("6. Veg Burger ");
    }
}
class NonVegRestaurant extends Restaurant
{
    void nonVegSpecialMenu()
    {
        System.out.println("----- Non-Veg Special Menu -----");
        System.out.println("1. Chicken Biryani" );
        System.out.println("2. Butter Chicken ");
        System.out.println("3. Fish Curry ");
        System.out.println("4. Chicken Burger ");
        System.out.println("5. Chicken Pasta ");
        System.out.println("6. Chicken Pizza ");
    }
}
public class FoodDelivery {
    public static void main(String[] args)
    {
        VegRestaurant r1 = new VegRestaurant();
        r1.restaurant_name = "Veggie Corner";
        r1.showMenu();
        r1.vegSpecialMenu();

        System.out.println();

        NonVegRestaurant r2 = new NonVegRestaurant();
        r2.restaurant_name = "NonVeggie Corner";
        r2.showMenu();
        r2.nonVegSpecialMenu();
    }  
}
