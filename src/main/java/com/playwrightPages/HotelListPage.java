package com.playwrightPages;

import com.microsoft.playwright.Page;

public class HotelListPage {
Page page;
public HotelListPage(Page page){
    this.page=page;
}
String radioButton="//input[@type='radio']";
String continueButton="#continue";

public void setRadioButton(){
    page.click(radioButton);
    page.click(continueButton);
}
}
