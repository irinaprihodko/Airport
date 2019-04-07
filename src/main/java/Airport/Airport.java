package Airport;

import java.util.ArrayList;
import java.util.List;

public class Airport implements PublicPlace {
    private List<Passenger> passengers;
    private List<Pilot> pilots;
    private Plane[] planes;
    private List<Flight> arrivalList;
    private List<Flight> departureList;

    public Airport() {
        this.passengers = new ArrayList<Passenger>();
        this.pilots = new ArrayList<Pilot>();
        this.planes = new Plane[50];
        this.arrivalList = new ArrayList<Flight>();
        this.departureList = new ArrayList<Flight>();
    }

    public void addPassengertoFlight(Passenger p) {
        passengers.add(p);
    }
    public String getInfo() {
            StringBuilder sb = new StringBuilder();
            sb.append("Прибывающие рейсы:\n");
            sb.append ("№\t  Направление\t Пилот №1: \t\tПилот №2: \t\tВремя вылета \t Время прибытия \n");
            for (Flight f : arrivalList) {
                sb.append(f.getInfo());
            }
            sb.append("Отправляющиеся рейсы:\n");
            sb.append ("№\t  Направление\t Пилот №1: \t\tПилот №2: \t\tВремя вылета \t Время прибытия\n");
            for (Flight f : departureList) {
                sb.append(f.getInfo());
            }
            String str = sb.toString();
            return str;
    }

    public void addArrivalFlight (Flight f){
            arrivalList.add(f);
        }
        public void addDepartureFlight (Flight f){
            departureList.add(f);
        }



    }

