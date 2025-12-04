package metodos;

public class Burger {

    private int cantBurgers;
    private String cheeseType;

    public Burger(int cantBurgers, String cheeseType) {
        this.cantBurgers = cantBurgers;
        this.cheeseType = cheeseType;
    }

    // static factory methods adapted for Java 21

    public static Burger createWithCantBurgersFirst(int cantBurgers, String cheeseType) {
        return new Burger(cantBurgers, cheeseType);
    }

    public static Burger createWithCheeseTypeFirst(String cheeseType, int cantBurgers) {
        return new Burger(cheeseType, cantBurgers);

    }

    @Override
    public String toString() {
        return "Burger " + cantBurgers + " number of burgers, type of cheese " + cheeseType;
    }

    public static void main(String[] args) {

        Burger burger1 = Burger.createWithCantBurgersFirst(2, "Provolone");
        Burger burger2 = Burger.createWithCheeseTypeFirst("Mozzarella", 3);

        System.out.println(burger1);
        System.out.println(burger2);
    }
}
