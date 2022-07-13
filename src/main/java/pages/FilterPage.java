package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FilterPage {

  private void openHeader(String header) {
    $(By.xpath("//*[@id=\"ftfbn-portal\"]" +
            "/div[2]" +
            "/div" +
            "/div" +
            "/div" +
            "/div[1]" +
            "/div[5]" +
            "/div" +
            "/div" +
            "/div[text()='"+ header +"']")).click();
  }
  private void setCheckbox(String header, String checkbox) {

    boolean isCheckboxInUl = $(By.xpath("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div/div/div[text()='"+ header +"']/../../div/div/ul")).exists();

    String xPathCheckbox;
    if (isCheckboxInUl) {
      xPathCheckbox = "//*[@id=\"ftfbn-portal\"]" +
              "/div[2]" +
              "/div" +
              "/div" +
              "/div" +
              "/div[1]" +
              "/div[5]" +
              "/div" +
              "/div" +
              "/div[text()='"+ header +"']" +
              "/.." +
              "/.." +
              "/div" +
              "/div" +
              "/ul" +
              "/li" +
              "/label[text()='"+ checkbox +"']";
    } else {
      xPathCheckbox = "//*[@id=\"ftfbn-portal\"]" +
              "/div[2]" +
              "/div" +
              "/div" +
              "/div" +
              "/div[1]" +
              "/div[5]" +
              "/div" +
              "/div" +
              "/div[text()='"+ header +"']" +
              "/.." +
              "/.." +
              "/div" +
              "/div" +
              "/div" +
              "/div" +
              "/label[text()='"+ checkbox +"']";
    }

    $(By.xpath(xPathCheckbox)).click();
  }
  private boolean isOpenHeader(String header) {
    return $(By.xpath("//*[@id=\"ftfbn-portal\"]" +
            "/div[2]" +
            "/div" +
            "/div" +
            "/div" +
            "/div[1]" +
            "/div[5]" +
            "/div" +
            "/div" +
            "/div[text()='"+ header +"']" +
            "/.." +
            "/.." +
            "/div[@class='modal-settings-row']")).exists();
  }

  public void openFilterSettingButton() {
    $(By.xpath("//*[@id=\"chexboxestab-container\"]/span")).click();
  }

  public void setCheckboxFilter(String header, String checkbox) {

   if (!isOpenHeader(header))
     openHeader(header);

   setCheckbox(header, checkbox);
  }

  public void setDate(String header, String titleGroup, String dateFrom, String dateTo) {

    if (!isOpenHeader(header))
      openHeader(header);

    $(By.xpath("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div/div/div[text()='"+ header +"']/../../div/div/div/div/div[text()='"+ titleGroup +"']/../div/div[1]/div/div/input")).setValue(dateFrom).pressEscape();

    $(By.xpath("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[5]/div/div/div[text()='"+ header +"']/../../div/div/div/div/div[text()='"+ titleGroup +"']/../div/div[3]/div/div/input")).setValue(dateTo).pressEscape();
  }

  public void clickSearchButton() {
    $(By.xpath("//*[@id=\"ftfbn-portal\"]/div[2]/div/div/div/div[1]/div[6]/div/div/button")).click();
  }

}
