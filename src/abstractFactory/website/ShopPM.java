package abstractFactory.website;

import abstractFactory.ProjectManager;

public class ShopPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Shop PM manages website");
    }
}