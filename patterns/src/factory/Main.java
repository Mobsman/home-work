package factory;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("espresso");
        System.out.println(coffee.brew());
    }
}
