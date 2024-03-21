import pages.android.LoginPageAndroid;
import pages.ios.LoginPageIOS;

public class BaseTest {
    String platform = "iOS";

    public void setUp(){

    }
    LoginPageAndroid loginPageAndroid = new LoginPageAndroid();
    LoginPageIOS loginPageIOS = new LoginPageIOS();
}
