package Airport;

public class Flight {

    private String name;
    private Pilot p1;
    private Pilot p2;
    private Plane plane;
    private String takingOffTime;
    private String landingTime;

    public Flight(String name, Pilot p1, Pilot p2, Plane plane, String takingOffTime, String landingTime) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.plane = plane;
        this.takingOffTime = takingOffTime;
        this.landingTime = landingTime;
    }

    public Flight() {

    }

        public String getInfo (){
        StringBuilder sb = new StringBuilder();

        sb.append (plane.getNumber()+"\t");
        sb.append (this.name + "\t");
        sb.append (p1.getName()+" "+ p1.getSurname()+ "\t\t");
        sb.append (p2.getName()+" "+ p2.getSurname()+ "\t\t\t");
        sb.append (this.takingOffTime+ "\t\t\t" );
        sb.append (this.landingTime + "\n");

        return sb.toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pilot getP1() {
        return p1;
    }

    public void setP1(Pilot p1) {
        this.p1 = p1;
    }

    public Pilot getP2() {
        return p2;
    }

    public void setP2(Pilot p2) {
        this.p2 = p2;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getTakingOffTime() {
        return takingOffTime;
    }

    public void setTakingOffTime(String takingOffTime) {
        this.takingOffTime = takingOffTime;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
    }
}
