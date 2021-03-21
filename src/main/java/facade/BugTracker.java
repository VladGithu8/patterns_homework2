package facade;

public class BugTracker {

    private boolean active;

    public boolean isActive(){
        return active;
    }

    public void start(){
        System.out.println("Job active!");
        active = true;
    }

    public BugTracker finish(){
        System.out.println("Job is not active!");
        active = false;
        return null;
    }
}

