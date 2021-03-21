package adapter;

public class MainAdapter {
    public static void main(String[] args) {

        SpaceStation spaceStation = new SpaceStation("Space Star");
        RocketImpl falcon = new RocketImpl("Falcon 9", 9000, "Block 5");
        SatelliteImpl bhutan = new SatelliteImpl("Bhutan 1", 111, "Falcon");
        SatelliteInterface rocketAdapter = new RocketAdapter(falcon);

        spaceStation.stackingToSpaceStation(bhutan);
        spaceStation.stackingToSpaceStation(rocketAdapter);

    }
}


