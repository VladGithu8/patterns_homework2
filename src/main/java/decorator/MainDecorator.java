package decorator;

public class MainDecorator {
    public static void main(String[] args) {

        Developer developer = new TeamLeadDeveloper(new SeniorDeveloper(new DeveloperImpl()));
        System.out.println(developer.doJob());

    }
}

