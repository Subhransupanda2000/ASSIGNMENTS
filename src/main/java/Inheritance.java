public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of the bike class
        bike object = new bike();

        // Call the bikeRider method
        object.bikeRider();

        // Call the rider method from the car class (inherited)
        object.rider();
    }
}

class car {
    public void rider() {
        System.out.println("Riding a car");
    }
}

class bike extends car {
    public void bikeRider() {
        System.out.println("Riding a bike");
    }
}
