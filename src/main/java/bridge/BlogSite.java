package bridge;

public class BlogSite extends SitePages{

    public BlogSite(PageInterface pageInterface) {
        super(pageInterface);
    }

    @Override
    public void createPage() {
        System.out.println("Start to create pages for BLOG");
        pageInterface.create();
    }
}
