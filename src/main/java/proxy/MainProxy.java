package proxy;

public class MainProxy {
    public static void main(String[] args) {

        ProjectImpl project = new ProjectImpl("http://www.project");
        project.run();

    }
}


