package builderpattern;

public interface Builder {
    void setShipType(ShipType type);
    void setCrew(int crew);
    void setSize(int size);
}
