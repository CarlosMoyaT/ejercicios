package builderpattern;

public class Ship {

    private final ShipType shipType;
    private final int crew;
    private final int size;

    public Ship(ShipType shipType, int crew, int size) {
        this.shipType = shipType;
        this.crew = crew;
        this.size = size;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public int getCrew() {
        return crew;
    }

    public int getSize() {
        return size;
    }

}
