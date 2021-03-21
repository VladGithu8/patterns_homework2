package facade;

public class MainFacade {
    public static void main(String[] args) {

        Developer developer = new Developer();
        Process process = new Process();
        BugTracker bugTracker = new BugTracker();
//        bugTracker.start();

        ProcessFlow processFlow = new ProcessFlow(developer, process, bugTracker);
        processFlow.coding();
    }
}

