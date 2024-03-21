package pages.android;

import actions.AndroidMobileActions;
import pages.proto.BasePage;

public class BasePageAndroid implements BasePage {
    // base locators
    AndroidMobileActions androidMobileActions = new AndroidMobileActions();

    @Override
    public void checkHeader() {
        //android implementation
    }

    @Override
    public void checkFooter() {
        //android implementation
    }
}
