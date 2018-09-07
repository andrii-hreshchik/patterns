package FactoryPatter;

public class FactoryPattern {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car audi = factory.create("Audi");
        toyota.drive();
        audi.drive();
    }

}

class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}

interface Car {
    void drive();

}

class Toyota implements Car {
    public void drive() {
        System.out.println("Toyota");
    }
}

class Audi implements Car {
    public void drive() {
        System.out.println("Audi");
    }
}