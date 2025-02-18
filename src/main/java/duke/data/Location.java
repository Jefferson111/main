package duke.data;

public class Location {
    private double latitude;
    private double longitude;
    private double distX;
    private double distY;
    private String address;

    /**
     * Creates a location object.
     */
    public Location(String address, double latitude, double longitude, double distX, double distY) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distX = distX;
        this.distY = distY;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistX() {
        return distX;
    }

    public double getDistY() {
        return distY;
    }

    public String getAddress() {
        return address;
    }
}
