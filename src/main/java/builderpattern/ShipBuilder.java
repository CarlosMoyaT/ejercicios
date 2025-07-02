package builderpattern;

import builderpattern.Builder;

public class ShipBuilder implements Builder {

    private ShipType type;
    private int crew;
    private int size;

    public ShipBuilder(ShipType type) {
        this.type = type;
    }

    @Override
    public void setShipType(ShipType type) {

    }

    @Override
    public void setCrew(int crew) {
        this.crew = crew;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public Ship getResult() {
        return new Ship(type, crew, size);
    }
}
