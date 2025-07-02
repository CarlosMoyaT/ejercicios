package builderpattern;

public class Director {

    public void constructCombatShip(Builder builder) {
        builder.setShipType(ShipType.COMBAT_SHIP);
        builder.setCrew(4);
        builder.setSize(20);
    }

    public void constructCargoShip(Builder builder) {
        builder.setShipType(ShipType.CARGO_SHIP);
        builder.setCrew(6);
        builder.setSize(50);
    }

    public void constructMiningShip(Builder builder) {
        builder.setShipType(ShipType.MINING_SHIP);
        builder.setCrew(2);
        builder.setSize(35);
    }
}
