package builderpattern;

public class Manual {

    private final ShipType shiptType;
    private final int crew;
    private final int size;

    public Manual(ShipType shiptType, int crew, int size) {
        this.shiptType = shiptType;
        this.crew = crew;
        this.size = size;
    }

    public String print() {
        String info = "";
        info += "Type of ship: " + shiptType + "\n";
        info += "Count of crew: " + crew + "\n";
        info += "size: " + size + "\n";

        return info;
    }
}
