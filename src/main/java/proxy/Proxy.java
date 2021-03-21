package proxy;

public class Proxy implements Project {

    private String url;
    private ProjectImpl project;

    public Proxy(String url, ProjectImpl project) {
        this.url = url;
        this.project = project;
    }

    @Override
    public void run(){
        if(project == null){
            project = new ProjectImpl(url);
            project.run();
        }
    }
}

