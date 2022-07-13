package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProducerPage {

  public void clickButton(String button) {
    $(By.xpath("//*[@id=\"dnn_ctr1253_HtmlModule_lblContent\"]/div/div/div/a/h2[text()='"+ button +"']/..")).click();
  }

}
