package com.playwrightPages;

import com.microsoft.playwright.Page;

public class BookingItineraryPage {
    Page page;
    public BookingItineraryPage (Page page){
        this.page=page;
    }
    String myItenary="#my_itinerary";
    String clickCheckBox="//input[@type='checkbox']";

    public void clickOnMyItineraryButton(){
        page.click(myItenary);
        page.click(clickCheckBox);
    }

}
