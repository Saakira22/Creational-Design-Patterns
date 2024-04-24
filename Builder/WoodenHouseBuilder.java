// Concrete implementation of the HouseBuilder interface for a WoodenHouse
class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildWalls(String walls) {
        house.setWalls("Wooden " + walls);
    }

    @Override
    public void buildRoof(String roof) {
        house.setRoof("Wooden " + roof);
    }

    @Override
    public void buildDoors(String doors) {
        house.setDoors("Wooden " + doors);
    }

    @Override
    public void buildWindows(String windows) {
        house.setWindows("Wooden " + windows);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
