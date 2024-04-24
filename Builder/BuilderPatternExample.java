public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating a specific builder for a wooden house
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();

        // Creating a director to manage the construction process
        HouseConstructionDirector woodenHouseDirector = new HouseConstructionDirector(woodenHouseBuilder);

        // Constructing and retrieving the wooden house
        House woodenHouse = woodenHouseDirector.constructHouse();

        // Displaying the house information
        System.out.println(woodenHouse.getHouseInfo());

        // Creating a specific builder for a concrete house
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();

        // Creating a director to manage the construction process
        HouseConstructionDirector concreteHouseDirector = new HouseConstructionDirector(concreteHouseBuilder);

        // Constructing and retrieving the concrete house
        House concreteHouse = concreteHouseDirector.constructHouse();

        // Displaying the house information
        System.out.println(concreteHouse.getHouseInfo());
    }
}
