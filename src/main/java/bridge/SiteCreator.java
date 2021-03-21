package bridge;

public class SiteCreator {

    public SitePages [] sitePages;

    public SiteCreator(SitePages[] sitePages) {
        this.sitePages = sitePages;
    }

    public void startCreateSitePages(){
        for(SitePages page : sitePages){
            page.createPage();

        }
    }
}

