package abstractFactory.website;

import abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testWebsite() {
        System.out.println("Manual tester tests website");
    }
}