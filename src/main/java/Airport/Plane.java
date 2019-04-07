package Airport;

public class Plane {
    private int numberOfFlight;
    private String company;


    public Plane(int number, String company) {
        this.numberOfFlight = number;
        this.company = company;
    }

    public Plane() {
        this.numberOfFlight = 0;
        this.company = "";
    }

    public int getNumber() {
        return numberOfFlight;
    }

    public void setNumber(int number) {
        this.numberOfFlight = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

