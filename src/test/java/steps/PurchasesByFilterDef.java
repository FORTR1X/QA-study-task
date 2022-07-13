package steps;

import io.cucumber.java.en.*;
import pages.BasicPage;
import pages.FilterPage;
import pages.ProducerPage;

public class PurchasesByFilterDef {

  BasicPage basicPage = new BasicPage();
  ProducerPage producerPage = new ProducerPage();
  FilterPage filterPage = new FilterPage();
  PurchasesInfoPage purchasesInfoPage = new PurchasesInfoPage();

  @Given("In footer {string}, go to {string}")
  public void clickButtonInFooter(String header, String button) {
    basicPage.clickButtonInFooter(header, button);
  }

  @When("Click {string} button")
  public void clickButton(String button) {
    producerPage.clickButton(button);
  }

  @Then("Open filter settings")
  public void openFilterSettingButton() {
    filterPage.openFilterSettingButton();
  }

  @And("In {string} click {string} checkbox")
  public void setCheckbox(String header, String checkbox) { filterPage.setCheckboxFilter(header, checkbox); }

  @And("In {string}, in {string}, from {string} to {string}")
  public void setDate(String header, String titleGroup, String dateFrom, String dateTo) { filterPage.setDate(header, titleGroup, dateFrom, dateTo); }

  @And("Click search button")
  public void clickSearchButton() { filterPage.clickSearchButton(); }

}
