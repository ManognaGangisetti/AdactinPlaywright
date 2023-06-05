package com.playwrightExecution;

import com.TestData.ReadDataFromJsonFile;

import com.playwrightPages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.playwrightBase.*;

public class PlaywrightTest extends PlaywrightBaseTest {
    public AdactinLoginPage playwrightLogin;
    SearchHotelPage searchHotelPage;
    HotelListPage hotelListPage;
    DetailsFillingPage detailsFillingPage;
    BookingItineraryPage bookingItineraryPage;
    ReadDataFromJsonFile readDataFromJson;

    @BeforeTest
    public void launch() {
        playwrightLogin = new AdactinLoginPage(page);
        searchHotelPage = new SearchHotelPage(page);
        hotelListPage = new HotelListPage(page);
        detailsFillingPage = new DetailsFillingPage(page);
        bookingItineraryPage = new BookingItineraryPage (page);
        readDataFromJson = new ReadDataFromJsonFile();

    }

    @Test
    public void validatingTest() throws Exception {
        playwrightLogin.login();
        searchHotelPage.selectingTheElements();
        hotelListPage.setRadioButton();
        detailsFillingPage.enteringTheData();
        bookingItineraryPage.clickOnMyItineraryButton();
    }


}
