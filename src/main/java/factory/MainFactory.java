package factory;

public class MainFactory {
    public static void main(String[] args) {
        FactoryPotion factoryPotion = new FactoryPotion();
        PotionInterface p = factoryPotion.potionCreator();
        PotionState ps = new PotionState();
        ps.setPotionState(p);
    }
}

//Патерны по категориям
//UML
//Два вида патернов
//
