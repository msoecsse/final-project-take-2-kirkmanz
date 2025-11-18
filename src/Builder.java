//Builder interface defines the steps
public interface Builder {
    void buildBedrooms(int bedrooms);
    void buildBathrooms(int bathrooms);
    void buildPool(boolean pool);
    void buildGarage(boolean garage);
    House getResult();
}
