//complex object to be constructed ( Product class )
class House {
    private String walls;
    private String roof;
    private String doors;
    private String windows;

    // Setters for the components of the house
    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    // Getter method to retrieve the constructed House object
    public String getHouseInfo() {
        return "House Configuration:\n" +
                "\n Walls: " + walls + "\n" +
                "Roof: " + roof + "\n" +
                "Doors: " + doors + "\n" +
                "Windows: " + windows + "\n"+"**********************";
    }
}







