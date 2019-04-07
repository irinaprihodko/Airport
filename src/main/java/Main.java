import Airport.*;

public class Main {
    public static int random( int min, int max){
        int randomValue = (int) (min + Math.random()*(max-min+1));
        return randomValue;
    }

    public static Flight createFlight (String name){
        Pilot p1 =  new Pilot("Иван", "Иванов", random(20,50), 80);
        Pilot p2 =  new Pilot("Борис", "Борисов", random(20,50), 80 );
        Plane plane = new Plane (random(100,900),"Boeing");
        Flight f1 = new Flight (name,p1,p2,plane,"10:50","13:40");

        return f1;
    }
    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight f1 = createFlight( "Kиев - Милан");
        Flight f2 = createFlight( "Киев - Mocква");
        Flight f3 = createFlight( "Киев - Прага");
        Flight f4 = createFlight( "Мадрид - Киев");
        Flight f5 = createFlight( "Париж - Киев");

        airport.addArrivalFlight(f1);
        airport.addArrivalFlight(f2);
        airport.addArrivalFlight(f3);
        airport.addDepartureFlight(f4);
        airport.addDepartureFlight(f5);

        MyFileWriter.writeTextToFile(airport.getInfo());

         System.out.println(airport.getInfo());
    }


}