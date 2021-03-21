package decorator;

public class SeniorDeveloper extends Decorator{

    public SeniorDeveloper(Developer developer){
        super(developer);
    }

    public String CodeRev(){
        return "Senior developer make cod review!";
    }

    @Override
    public String doJob(){
        return super.doJob() + CodeRev();
    }

}
