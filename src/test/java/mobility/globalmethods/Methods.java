package mobility.globalmethods;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Methods {
    public void verifyElement(String text, WebElement element) {
        Assert.assertEquals(text, element.getText());
    }
}
