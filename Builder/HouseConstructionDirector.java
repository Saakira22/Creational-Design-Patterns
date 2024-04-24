// Director class responsible for the construction process
class HouseConstructionDirector {
    private HouseBuilder houseBuilder;

    public HouseConstructionDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //inputs
    public House constructHouse() {
        houseBuilder.buildWalls("Brick");
        houseBuilder.buildRoof("Shingle");
        houseBuilder.buildDoors("Doors");
        houseBuilder.buildWindows("Glass");

        return houseBuilder.getHouse();
    }
}