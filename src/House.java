//Product: complex object
public class House {
    private int numbedRooms;
    private int numBathrooms;
    private boolean hasPool;
    private boolean hasGarage;

    public void setBedrooms(int numberRooms) {
        numbedRooms = numberRooms;
    }

    public void setBathrooms(int numRooms) {
        numBathrooms = numRooms;
    }

    public void setHasPool(boolean pool) {
        hasPool = pool;
    }

    public void setHasGarage(boolean garage) {
        hasGarage = garage;
    }

    public void displayInfo() {
        System.out.println("House Plan:"
                + "\nBedrooms: " + numbedRooms
                + "\nBathrooms: " + numBathrooms
                + "\nPool: " + hasPool
                + "\nGarage: " + hasGarage
                + "\n\n");
    }
}
