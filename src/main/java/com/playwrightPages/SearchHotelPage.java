package com.playwrightPages;

//import ReadData.PlaywrightJson;

import com.TestData.ReadDataFromJsonFile;

import com.microsoft.playwright.Page;

public class SearchHotelPage {
    Page page;
    ReadDataFromJsonFile readDataFromJson;

    public SearchHotelPage(Page page) {
        this.page = page;
        readDataFromJson = new ReadDataFromJsonFile();
    }

    String locationBar = "#location";
    String Hotels = "#hotels";
    String room_Type = "#room_type";
    String number_Of_Rooms = "#room_nos";
    String check_In_Date = "#datepick_in";
    String check_Out_Date = "#datepick_out";
    String adults_Per_Room = "#adult_room";
    String children_Per_Room = "#child_room";
    String search = "#Submit";
    public void selectingTheElements() {
//        Locator locationbar=page.locator("#location");
//        int citylocation=Integer.parseInt(readDatafromJson.readValueFromJson("Location"));
//        locationbar.selectOption(new SelectOption().setIndex(citylocation));
//        Locator Hotels=page.locator("#hotels");
//        String  hotelname=page.type(Hotels,readDatafromJson.readValueFromJson("Hotels"));
//        hotelname.selectOption(new SelectOption().setValue(hotelname));

        page.locator(locationBar).selectOption(readDataFromJson.readValueFromJson("Location"));
        page.locator(Hotels).selectOption(readDataFromJson.readValueFromJson("Hotels"));
        page.locator(room_Type).selectOption(readDataFromJson.readValueFromJson("Room Type"));
        page.locator(number_Of_Rooms).selectOption(readDataFromJson.readValueFromJson("Number of Rooms"));
        page.locator(check_In_Date).fill(readDataFromJson.readValueFromJson("Check In Date"));
        page.locator(check_Out_Date).fill(readDataFromJson.readValueFromJson("Check Out Date"));
        page.locator(adults_Per_Room).selectOption(readDataFromJson.readValueFromJson("Adults per Room"));
        page.locator(children_Per_Room).selectOption(readDataFromJson.readValueFromJson("Children per Room"));
        page.click(search);
    }
}


