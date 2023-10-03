package fleetofthings;

public class FleetOfThings {
    public static void main(String[] args) {

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        Thing lunch = new Thing("Eat lunch");


        Fleet fleet = new Fleet();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(stand);
        fleet.add(lunch);

        fleet.getThings().get(2).complete();
        fleet.getThings().get(3).complete();

        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}
