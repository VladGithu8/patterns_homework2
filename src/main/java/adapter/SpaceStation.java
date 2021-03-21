package adapter;

public class SpaceStation {

    String name;

    public SpaceStation(String name) {
        this.name = name;
    }

    public void stackingToSpaceStation(SatelliteInterface satellite){
        satellite.stacking(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
