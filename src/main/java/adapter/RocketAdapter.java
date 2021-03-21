package adapter;

public class RocketAdapter implements SatelliteInterface  {

    RocketImpl rocket;

    public RocketAdapter(RocketImpl rocket) {
        this.rocket = rocket;
    }

    @Override
    public String satelliteManeuver() {
        return null;
    }

    @Override
    public void stacking(String spaceStationName) {
        int on = rocket.onEngine();
        String start = rocket.start(on);
        rocket.connectToSpaceStation(on, start, spaceStationName);
    }
}

