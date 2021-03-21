package bridge;

public class MoveSite extends SitePages {

    public MoveSite(PageInterface pageInterface) {
        super(pageInterface);
    }

    @Override
    public void createPage() {
        System.out.println("Start to create pages for MOVE site");
        pageInterface.create();
    }
}
