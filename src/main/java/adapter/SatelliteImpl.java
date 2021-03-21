package adapter;

public class SatelliteImpl implements SatelliteInterface{

    String name;
    int weight;
    String BoosterRocket;

    public SatelliteImpl(String name, int weight, String boosterRocket) {
        this.name = name;
        this.weight = weight;
        BoosterRocket = boosterRocket;
    }

    @Override
    public String satelliteManeuver() {
        return null;
    }

    @Override
    public void stacking(String spaceStationName) {
        System.out.println("Satellite " + name + " stacking to: " + spaceStationName);
        System.out.println("-------------------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBoosterRocket() {
        return BoosterRocket;
    }

    public void setBoosterRocket(String boosterRocket) {
        BoosterRocket = boosterRocket;
    }
}


