package factory;

public class CoffeeFactory {

    public static Coffee createCoffee(String coffeeType) {
        return switch (coffeeType.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Неизвестный тип кофе: " + coffeeType);
        };
    }

    public static void main(String[] args) {
        System.out.println(CoffeeFactory.createCoffee("espresso").brew());
    }
}
