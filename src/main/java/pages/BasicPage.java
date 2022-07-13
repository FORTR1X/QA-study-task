package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

  public void clickButtonInFooter(String header, String button) {
    $(By.xpath("//*[@id=\"footer-common\"]" +
            "/section[1]" +
            "/div" +
            "/div[2]" +
            "/div" +
            "/nav" +
            "/h4[text()='"+ header +"']" +
            "/.." +
            "/ul[1]" +
            "/li" +
            "/a[text()='"+ button +"']")).click();
  }

}
