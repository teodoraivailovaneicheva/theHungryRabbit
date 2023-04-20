public class Location {

    private final int locationID;
    private final String description;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;

    }

    public int getLocationID() {

        return locationID;
    }

    public String getDescription() {

        return description;
    }

}