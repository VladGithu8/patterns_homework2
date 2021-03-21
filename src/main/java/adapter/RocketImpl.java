package adapter;

public class RocketImpl implements RocketInterface {

    private String name;
    private int weight;
    private String boosterRocket;

    public int engineIsOn;

    public RocketImpl(String name, int weight, String boosterRocket) {
        this.name = name;
        this.weight = weight;
        this.boosterRocket = boosterRocket;
    }

    @Override
    public int onEngine() {
        System.out.println("Rocket " + name + " engine is on!");
        engineIsOn = 1;
        return engineIsOn;
    }

    @Override
    public String start(int engineIsOn) {
        String goodStart = null;
        if(engineIsOn == 1)
            goodStart = "The rocket flew!";
        System.out.println(goodStart);
        return goodStart;
    }

    @Override
    public String connectToSpaceStation(int engineIsOn, String goodStart, String spaceStationName) {
        System.out.println("Start connection");
        String connection = null;
        if (engineIsOn == 1 && goodStart.equals("The rocket flew!")){
            connection = "Connection to space station" + spaceStationName;
        }
        System.out.println("Rocket " + name + " with booster " + boosterRocket + " connect to " + spaceStationName);
        return connection;
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
        return boosterRocket;
    }

    public void setBoosterRocket(String boosterRocket) {
        this.boosterRocket = boosterRocket;
    }
}


