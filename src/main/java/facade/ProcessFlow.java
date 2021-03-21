package facade;

public class ProcessFlow {

    private Developer developer;
    private Process process;
    private BugTracker bugTracker;

    public ProcessFlow(Developer developer, Process process, BugTracker bugTracker) {
        this.developer = developer;
        this.process = process;
        this.bugTracker = bugTracker;
    }

    public void coding(){
        process.doProcess();
        bugTracker.start();
        developer.doJob(bugTracker);
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public BugTracker getBugTracker() {
        return bugTracker;
    }

    public void setBugTracker(BugTracker bugTracker) {
        this.bugTracker = bugTracker;
    }
}


