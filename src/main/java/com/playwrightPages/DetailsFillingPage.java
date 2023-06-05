package com.playwrightPages;

import com.TestData.ReadDataFromJsonFile;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DetailsFillingPage {
    Page page;
    ReadDataFromJsonFile readDataFromJson;

    public DetailsFillingPage(Page page) {
        this.page = page;
        readDataFromJson = new ReadDataFromJsonFile();
    }

    //    String firstname="#first_name";
//    String lastname="#last_name";
//    String address="#address";
//    String creditcardnumber="#cc_num";
//    String creditcardtype="#cc_type";
//    String expirydatemonth="#cc_exp_month";
//    String expirydateyear="#cc_exp_year";
//    String cvvnumber="#cc_cvv";
    String bookNow = "#book_now";

    public void enteringTheData() {
        Locator firstName = page.locator("#first_name");
        firstName.fill(readDataFromJson.readValueFromJson("Firstname"));
        Locator lastName = page.locator("#last_name");
        lastName.fill(readDataFromJson.readValueFromJson("Lastname"));
        Locator address = page.locator("#address");
        address.fill(readDataFromJson.readValueFromJson("Billing Address"));
        Locator creditCardNumber = page.locator("#cc_num");
        creditCardNumber.fill(readDataFromJson.readValueFromJson("CreditCardNumber"));
        Locator creditCardType = page.locator("#cc_type");
        creditCardType.selectOption(readDataFromJson.readValueFromJson("CreditCardType"));
        Locator expiryDateMonth = page.locator("#cc_exp_month");
        expiryDateMonth.selectOption(readDataFromJson.readValueFromJson("Expirydatemonth"));
        Locator expiryDateYear = page.locator("#cc_exp_year");
        expiryDateYear.selectOption(readDataFromJson.readValueFromJson("ExpiryDateYear"));
        Locator cvvNumber = page.locator("#cc_cvv");
        cvvNumber.fill(readDataFromJson.readValueFromJson("CVV number"));
//        page.locator(firstname).type(  readDatafromJson.readValueFromJson("FirstName"));
//        page.locator(lastname).fill(readDatafromJson.readValueFromJson("LastName"));
//        page.locator(address).fill(readDatafromJson.readValueFromJson("Billing Address"));
//        page.locator(creditcardnumber).fill(readDatafromJson.readValueFromJson("CreditCardNumber"));
//        page.locator(creditcardtype).selectOption(readDatafromJson.readValueFromJson("CreditCardType"));
//        page.locator(expirydatemonth).selectOption(readDatafromJson.readValueFromJson("Expirydatemonth"));
//        page.locator(expirydateyear).selectOption(readDatafromJson.readValueFromJson("ExpiryDateYear"));
//        page.locator(cvvnumber).fill(readDatafromJson.readValueFromJson("CVV number"));
        page.click(bookNow);
    }
}
