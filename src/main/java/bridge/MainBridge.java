package bridge;

public class MainBridge {
    public static void main(String[] args) {
        SitePages[] sitePages = {new BlogSite(new VideoPage()),
                                 new MoveSite(new BlogPage())};
        SiteCreator siteCreator = new SiteCreator(sitePages);
        siteCreator.startCreateSitePages();
    }
}

