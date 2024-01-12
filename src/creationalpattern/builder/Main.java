package creationalpattern.builder;

import creationalpattern.builder.builders.CarBuilder;
import creationalpattern.builder.builders.ManualBuilder;
import creationalpattern.builder.director.Director;
import creationalpattern.builder.products.Car;
import creationalpattern.builder.products.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
