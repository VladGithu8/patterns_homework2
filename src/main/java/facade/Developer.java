package facade;

public class Developer  {

    public void doJob (BugTracker bugTracker) {
        if (bugTracker.isActive()) {
            System.out.println("Developer is develop!");
        } else {
            System.out.println("Developer not develop!");
        }
    }
}

