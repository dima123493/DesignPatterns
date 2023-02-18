package abstractFactory.banking;

import abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testWebsite() {
        System.out.println("QA tests banking website");
    }
}