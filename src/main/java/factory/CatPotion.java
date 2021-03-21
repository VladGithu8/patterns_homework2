package factory;

public class CatPotion implements PotionInterface{

    @Override
    public String takeThePotion(String state) {
        System.out.println("You take the potion and...");
        if (state.equals("normal")) {
            System.out.println("Haw effect");
        } else {
            System.out.println("No effect");
        }
        return state;
    }
}

