 // Builder interface defining the construction steps
interface HouseBuilder {
    void buildWalls(String walls);
    void buildRoof(String roof);
    void buildDoors(String doors);
    void buildWindows(String windows);
    House getHouse();
}


