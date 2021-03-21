package factory;

public class GromPotion implements PotionInterface{

    @Override
    public String takeThePotion(String state) {
        System.out.println("You take the potion and...");
        if (state.equals("chilled")) {
            System.out.println("Haw effect");
        } else {
            System.out.println("No effect");
        }
        return state;
    }
}


