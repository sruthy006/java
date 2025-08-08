import java.time.Year;

class Vehicle {
    String brand, type;
    int yearOfMake, ageOfVehicle;
    double purchasePrice;

    Vehicle(String brand, String type, int yearOfMake, double purchasePrice) {
        this.brand = brand;
        this.type = type;
        this.yearOfMake = yearOfMake;
        this.purchasePrice = purchasePrice;
        this.ageOfVehicle = Year.now().getValue() - yearOfMake;
    }

    void displayBasicInfo() {
        System.out.println("Brand: "  + brand);
        System.out.println("Type: " + type);
        System.out.println("Year of Manufacture: " + yearOfMake);
        System.out.printf("Purchase Price: INR %.2f\n", purchasePrice);
    }

    double calculateResaleValue() {
        return purchasePrice * Math.pow(0.85, ageOfVehicle);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String type, int yearOfMake, double purchasePrice, int numberOfDoors) {
        super(brand, type, yearOfMake, purchasePrice);
        this.numberOfDoors = numberOfDoors;
    }

    double calculateInsurance() {
        return (5000 * purchasePrice) + (1000 * numberOfDoors);
    }

    double calculateMaintenance() {
        return (3000 * ageOfVehicle) + (500 * numberOfDoors);
    }

    void showCompleteDetails() {
        System.out.println("Car Details:");
        displayBasicInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.printf("Insurance Cost: INR %.2f\n", calculateInsurance());
        System.out.printf("Maintenance Cost: INR %.2f\n", calculateMaintenance());
        System.out.printf("Estimated Resale Value: INR %.2f\n", calculateResaleValue());
        System.out.println();
    }
}

class Bike extends Vehicle {
    boolean hasSideCar;

    Bike(String brand, String type, int yearOfMake, double purchasePrice, boolean hasSideCar) {
        super(brand, type, yearOfMake, purchasePrice);
        this.hasSideCar = hasSideCar;
    }

    double calculateInsurance() {
        return (2500 * purchasePrice) + (hasSideCar ? 1500 : 0);
    }

    double calculateMaintenance() {
        return (2000 * ageOfVehicle) + (hasSideCar ? 1000 : 0);
    }

    void showCompleteDetails() {
        System.out.println("Bike Details:");
        displayBasicInfo();
        System.out.println("Side Car Included: " + (hasSideCar ? "Yes" : "No"));
        System.out.printf("Insurance Cost: INR %.2f\n", calculateInsurance());
        System.out.printf("Maintenance Cost: INR %.2f\n", calculateMaintenance());
        System.out.printf("Estimated Resale Value: INR %.2f\n", calculateResaleValue());
        System.out.println();
    }
}

public class RecordSystem {
    public static void main(String[] args) {

        Car luxuryCar = new Car("Audi", "A6", 2016, 18, 4);
        Bike commuterBike = new Bike("Honda", "Activa", 2021, 0.85, true);

        luxuryCar.showCompleteDetails();
        commuterBike.showCompleteDetails();
    }
}

