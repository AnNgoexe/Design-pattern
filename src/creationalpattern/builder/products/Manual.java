package creationalpattern.builder.products;

import creationalpattern.builder.components.Engine;
import creationalpattern.builder.components.GPSNavigator;
import creationalpattern.builder.components.Transmission;
import creationalpattern.builder.components.TripComputer;

public class Manual {
    private final CarType carType;

    private final int seats;

    private final Engine engine;

    private final Transmission transmission;

    private final TripComputer tripComputer;

    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info = info.concat("Type of car: " + this.carType + "\n");
        info = info.concat("Count of seats: " + this.seats + "\n");
        info = info.concat("Engine: volume - " + this.engine.getVolume() + "; mileage - " + engine.getMileage() + "\n");
        info = info.concat("Transmission: " + this.transmission + "\n");
        if (this.tripComputer != null) {
            info = info.concat("Trip Computer: Functional" + "\n");
        } else {
            info = info.concat("Trip Computer: N/A" + "\n");
        }
        if (this.gpsNavigator != null) {
            info = info.concat("GPS Navigator: Functional" + "\n");
        } else {
            info = info.concat("GPS Navigator: N/A" + "\n");
        }
        return info;
    }
}
