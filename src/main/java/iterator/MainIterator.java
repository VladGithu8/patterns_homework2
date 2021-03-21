package iterator;

public class MainIterator {
    public static void main(String[] args) {

     String[] skills = {"Docker", "Hibernate", "Java8"};

     Devloper devloper = new Devloper("Vlad", skills);
     Iterator iterator = devloper.getIterator();
        System.out.println("Developer " + devloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
