package Airport;

public class Passenger extends Human {
    private int ID;
    private String destination;

    public Passenger(String name, String surname, int ID, String destination) {
        super(name, surname);
        this.ID = ID;
        this.destination = destination;
    }

    public Passenger(int ID, String destination) {
        this.ID = ID;
        this.destination = destination;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
