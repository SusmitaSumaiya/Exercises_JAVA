package Example5;
public class Car {
    // Attributes of the outer class Car
    private String name;
    private String type;

    // Inner class Engine
    public class Engine {
        private String engineType;

        // Constructor for the inner class Engine
        public Engine(String engineType) {
            this.engineType = engineType;
        }

        // Method to get the engine type
        public String getEngineType() {
            return this.engineType;
        }
    }

    // Constructor for the outer class Car
    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method to create an instance of the inner class Engine
    public Engine createEngine(String engineType) {
        return new Engine(engineType);
    }

    // Method to determine if the car is small or big
    public void determineCarSize() {
        Engine engine = this.createEngine("4WD"); // create an instance of the inner class Engine with engine type "4WD"
        String engineType = engine.getEngineType();
        if (engineType.equals("4WD") || engineType.equals("2WD") || engineType.equals("RWD")) {
            System.out.println("The car is small");
        } else {
            System.out.println("The car is big");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Car car = new Car("Car Name", "Car Type");
        car.determineCarSize();
    }
}