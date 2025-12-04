//manages building process and order of construction
public class HouseDirector {

    public void construct(Builder builder, int bedrooms, int bathrooms, boolean garage, boolean pool){
        for(int i = 0; i < bedrooms; i++) {
            builder.buildBedrooms(bedrooms);
        }
        for(int i = 0; i < bathrooms; i++) {
            builder.buildBathrooms(bathrooms);
        }
        builder.buildGarage(garage);
        builder.buildPool(pool);
    }

}
