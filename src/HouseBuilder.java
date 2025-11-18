//Concrete Builder

public class HouseBuilder implements Builder{
    private House house = new House();

    @Override
    public void buildBedrooms(int bedrooms) {
        house.setBedrooms(bedrooms);
    }

    @Override
    public void buildBathrooms(int bathrooms) {
        house.setBathrooms(bathrooms);
    }

    @Override
    public void buildPool(boolean pool) {
        house.setHasPool(pool);
    }

    @Override
    public void buildGarage(boolean garage) {
        house.setHasGarage(garage);
    }

    @Override
    public House getResult() {
        return house;
    }
}
