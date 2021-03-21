package proxy;

public class ProjectImpl implements Project{

    private String url;

    public ProjectImpl(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading from: " + url);
    }

    @Override
    public void run(){
        System.out.println("Run project: " + url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
