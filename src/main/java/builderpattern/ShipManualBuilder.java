package builderpattern;

public class ShipManualBuilder implements Builder{

    private ShipType type;
    private int crew;
    private int size;


    @Override
    public void setShipType(ShipType type) {
        this.type = type;
    }

    @Override
    public void setCrew(int crew) {
        this.crew = crew;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public Manual getResult() {
        return new Manual(type, crew, size);
    }
}
