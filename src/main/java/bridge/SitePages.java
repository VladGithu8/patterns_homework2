package bridge;

public abstract class SitePages {

    PageInterface pageInterface;

    public SitePages(PageInterface pageInterface) {
        this.pageInterface = pageInterface;
    }

    public abstract void createPage();
}


