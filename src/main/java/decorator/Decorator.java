package decorator;

public class Decorator implements Developer {

    Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

    public String doJob(){
        return developer.doJob();
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
