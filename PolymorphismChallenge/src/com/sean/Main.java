package com.sean;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {             //engine and wheels don't need getters because their values are already set
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {                   //method to indicate the engine is on
        return "Car -> startEngine()";
    }

    public String accelerate() {                    //method to indicate the car has accelerated
        return "Car -> accelerate()";
    }

    public String brake() {                         //method to indicate the car has put on the brakes
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {                      //inherited parameters such that the constructor could be created

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car(8, "Base car"); // creates car object and prints out the Strings that were initialized
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Car(6, "Ford Falcon") {              // inline creates a class within a constructor... can be useful in phone apps
            @Override
			public String startEngine() {
				return "Ford -> startEngine()";
			}

            @Override
			public String accelerate() {
				return "Ford -> accelerate()";
			}

            @Override
			public String brake() {
				return "Ford -> brake()";
			}
        };             //can copy object create and change class name (to match class you copied with refactor)
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


    static class Holden extends Car {                      //Refactor can copy and move classes in the main class
		public Holden(int cylinders, String name) {
			super(cylinders, name);
		}

		@Override
		public String startEngine() {
			return getClass().getSimpleName() +  " -> startEngine()"; //get simple name retrieves the class name
		}

		@Override
		public String accelerate() {
			return getClass().getSimpleName() +  " -> accelerate()";
		}

		@Override
		public String brake() {
			return getClass().getSimpleName() +  " -> brake()";
		}
	}
}