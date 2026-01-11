// Inheritance Example
class Vehicle {

    String fuel;
    int speed;
    // Constructor
    Vehicle(String fuel, int speed) {
        this.speed = speed;
        this.fuel = fuel;
    }
    //Method
    void showDetails() {
        System.out.println("Fuel: " + fuel + ", Speed: " + speed);
    }
}
class Car extends Vehicle {
    Car(String fuel, int speed) {
        super(fuel, speed);
    }
    void drive() {
        System.out.println("Driving at speed: " + speed);
    }
}
class Bike extends Vehicle {
    Bike(String fuel, int speed) {
        super(fuel, speed);
    }
    void ride() {
        System.out.println("Riding at speed: " + speed);
    }
}

//Polymorphism Example 
//parent class
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}
//child class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
//child class
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Encapsulation Example
class Employee {
    // Private variables (Encapsulation)
    private int salary;
    private int overtime;
    private int rate;
    // Constructor
    Employee(int salary, int overtime, int rate) {
        this.salary = salary;
        this.overtime = overtime;
        this.rate = rate;
    }
    // Encapsulated method to calculate total salary
    public int getWage() {
        return salary + (overtime * rate);
    }
}

// Abstraction Example
class CoffeeMachine {

    // Private method
    private void heatWater() {
        System.out.println("Heating water...");
    }

    private void brewCoffee() {
        System.out.println("Brewing coffee...");
    }

    // Public method
    public void makeCoffee() {
        heatWater();
        brewCoffee();
        System.out.println("Coffee is ready!");
    }
}

public class Practice {

    public static void main(String[] args) {
        //Inheritance Example
        Car myCar = new Car("Diesel", 120);
        myCar.showDetails();
        myCar.drive();

        Bike myBike = new Bike("Petrol", 80);
        myBike.showDetails();
        myBike.ride();

        //Polymorphism Example
        Shape[] shapes = {new Circle(), new Rectangle()};
        for (Shape shape : shapes) {
            shape.draw();
        }

        // Encapsulation Example
        Employee emp = new Employee(50000, 10, 500);
        System.out.println("Total Wage: " + emp.getWage());

        // Abstraction Example
        CoffeeMachine machine = new CoffeeMachine();
        machine.makeCoffee();
    }
}
