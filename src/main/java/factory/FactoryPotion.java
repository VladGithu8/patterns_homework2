package factory;

import java.util.Scanner;

public class FactoryPotion {

    public PotionInterface potionCreator(){
        System.out.println("Hi witcher!" +
                "\nNeed to take potion?" +
                "\nLets create it first!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter potion name:" +
                "\n1. Cat potion" +
                "\n2. Grom potion");

        int potion = scanner.nextInt();
        if(potion == 1){
            System.out.println("You chose Cat Potion");
        }
        if (potion == 2) {
            System.out.println("You chose Grom Potion");
        }

        switch (potion){
            case 1 : return new CatPotion();
            case 2 : return new GromPotion();
            default: return null;
        }
    }
}


