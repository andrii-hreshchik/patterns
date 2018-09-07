package AbstractFactoryPattern;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory factory = new AbstractFactory();
        Factory<Car> carFactory = factory.create("AbstractFactoryPattern.Car");
        Factory<Tank> tankFactory = factory.create("AbstractFactoryPattern.Tank");
        Car toyota = carFactory.create("AbstractFactoryPattern.Toyota");
        Car audi = carFactory.create("AbstractFactoryPattern.Audi");
        Tank t51 = tankFactory.create("AbstractFactoryPattern.T51");
        Tank t52 = tankFactory.create("AbstractFactoryPattern.T52");
        toyota.drive();
        audi.drive();
        t51.drive();
        t52.drive();
    }
}

class CarFactory implements Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "AbstractFactoryPattern.Toyota":
                return new Toyota();
            case "AbstractFactoryPattern.Audi":
                return new Audi();
            default:
                return null;
        }
    }


}

class TankFactory implements Factory {
    public Tank create(String typeOfTank) {
        switch (typeOfTank) {
            case "AbstractFactoryPattern.T51":
                return new T51();
            case "AbstractFactoryPattern.T52":
                return new T52();
            default:
                return null;
        }
    }

}

interface Tank {
    void drive();
}

class T51 implements Tank {
    public void drive() {
        System.out.println("AbstractFactoryPattern.T51");
    }
}

class T52 implements Tank {
    public void drive() {
        System.out.println("AbstractFactoryPattern.T52");
    }
}


interface Car {
    void drive();

}

class Toyota implements Car {
    public void drive() {
        System.out.println("AbstractFactoryPattern.Toyota");
    }
}

class Audi implements Car {
    public void drive() {
        System.out.println("AbstractFactoryPattern.Audi");
    }
}

interface Factory<T> {
    T create(String type);
}

class AbstractFactory implements Factory {
    public Factory create(String typeOfFactory) {
        switch (typeOfFactory) {
            case "AbstractFactoryPattern.Tank":
                return new TankFactory();
            case "AbstractFactoryPattern.Car":
                return new CarFactory();
            default:
                return null;
        }
    }
}
