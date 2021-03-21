package factory;

import java.util.Scanner;

public class PotionState {

    public String setPotionState(PotionInterface p){
        System.out.println("Now lets chose state of potion!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter potion state:" +
                "\n1. Normal" +
                "\n2. Warm" +
                "\n3. Chilled");

        int state = scanner.nextInt();
        if(state == 1)
            System.out.println("You chose normal state");
        if (state == 2)
            System.out.println("You chose warm state");
        if (state == 3)
            System.out.println("You chose chilled state");

        switch (state){
            case 1: return p.takeThePotion("normal");
            case 2: return p.takeThePotion("warm");
            case 3: return p.takeThePotion("chilled");
            default: return "String";
        }
    }
}

