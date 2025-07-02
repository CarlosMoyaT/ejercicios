package builderpattern;

public class Demo {

    public static void main(String[] args) {

        Director director = new Director();

        ShipBuilder builder = new ShipBuilder(ShipType.CARGO_SHIP);
        director.constructCombatShip(builder);

        Ship ship = builder.getResult();
        System.out.println("Ship built:\n" + ship.getShipType());

        ShipManualBuilder manualBuilder = new ShipManualBuilder();

        director.constructCargoShip(manualBuilder);
        Manual shipManual = manualBuilder.getResult();
        System.out.println("\nShip manual built:\n" + shipManual.print());

    }
}
