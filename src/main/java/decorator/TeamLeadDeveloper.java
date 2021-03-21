package decorator;

public class TeamLeadDeveloper extends Decorator{

    public TeamLeadDeveloper(Developer developer){
        super(developer);
    }

    public String sendReport(){
        return " Send report to customer";
    }

    @Override
    public String doJob(){
        return super.doJob() + sendReport();
    }
}

