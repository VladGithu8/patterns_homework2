package singleton;

public class MainSingleton {
    public static void main(String[] args) {

        MySingleton mySingleton = MySingleton.getInstance(550);
        MySingleton secondMySingleton = MySingleton.getInstance(1000);

        System.out.println(mySingleton.value);
        System.out.println(secondMySingleton.value);

    }
}


