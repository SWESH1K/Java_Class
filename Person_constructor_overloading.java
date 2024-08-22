class Person {
    String name;
    int age;
    String address;

    // Constructor with only name
    public Person(String name) {
        this.name = name;
        this.age = 0; // Default age
        this.address = "Not provided"; // Default address
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not provided"; // Default address
    }

    // Constructor with name, age, and address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}



public class Person_constructor_overloading {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 25, "123 Main St");

        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
        System.out.println();
        person3.displayInfo();
    }
}
