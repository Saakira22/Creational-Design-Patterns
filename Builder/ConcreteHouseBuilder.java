// Concrete implementation of the HouseBuilder interface for a ConcreteHouse
class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildWalls(String walls) {
        house.setWalls("Concrete " + walls);
    }

    @Override
    public void buildRoof(String roof) {
        house.setRoof("Concrete " + roof);
    }

    @Override
    public void buildDoors(String doors) {
        house.setDoors("Concrete " + doors);
    }

    @Override
    public void buildWindows(String windows) {
        house.setWindows(windows);
    }

    @Override
    public House getHouse() {
        return house;
    }
}