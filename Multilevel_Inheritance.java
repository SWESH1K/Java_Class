
class Transportation {
    String source, destination;
    Transportation(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
}

class Vehicle extends Transportation {
    int num_of_passengers;
    Vehicle(String source, String destination, int num_of_passengers) {
        super(source, destination);
        this.num_of_passengers = num_of_passengers;
    }
}

class Bus extends Vehicle {
    String name, brand;
    int year;

    Bus(String name, String brand, int year, String source, String destination) {
        super(source, destination, 50);
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Number of passengers: " + num_of_passengers);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        String source = "Hyderabad", destination = "Mumbai"; // Declaring source and destination
        String name = "Morcopolo", brand = "Tata"; // Declaring name and brand
        int year = 2014;
        Bus bus = new Bus(name, brand, year, source, destination);
        bus.printDetails();
    }
}
