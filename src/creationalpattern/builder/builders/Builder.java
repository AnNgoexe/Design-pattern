package creationalpattern.builder.builders;

import creationalpattern.builder.products.CarType;
import creationalpattern.builder.components.Engine;
import creationalpattern.builder.components.GPSNavigator;
import creationalpattern.builder.components.Transmission;
import creationalpattern.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
