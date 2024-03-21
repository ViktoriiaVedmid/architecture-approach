package pages.ios;

import actions.IOSMobileActions;
import pages.proto.BasePage;

public class BasePageIOS implements BasePage {
    // base locators
    IOSMobileActions iosMobileActions = new IOSMobileActions();

    @Override
    public void checkHeader() {
        //IOS implementation
    }

    @Override
    public void checkFooter() {
        //IOS implementation
    }
}
