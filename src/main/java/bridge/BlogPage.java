package bridge;

public class BlogPage implements PageInterface {

    @Override
    public void create() {
        System.out.println("Create blog page for your site!");
    }
}

