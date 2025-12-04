//Product: complex object
public class House {
    private int numbedRooms;
    private int numBathrooms;
    private boolean hasPool;
    private boolean hasGarage;

    public void setBedrooms(int numberRooms) {
        numbedRooms = numberRooms;
    }

    public int getBedrooms() {
        return numbedRooms;
    }

    public void setBathrooms(int numRooms) {
        numBathrooms = numRooms;
    }

    public int getBathrooms() {
        return numBathrooms;
    }

    public void setHasPool(boolean pool) {
        hasPool = pool;
    }

    public boolean getHasPool(){
        return hasPool;
    }

    public void setHasGarage(boolean garage) {
        hasGarage = garage;
    }

    public boolean getHasGarage(){
        return hasGarage;
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
