package com.playwrightPages;

import com.TestData.ReadDataFromJsonFile;
import com.microsoft.playwright.Page;

public class AdactinLoginPage {
   public Page page;
    ReadDataFromJsonFile dataFromJson;
    public AdactinLoginPage(Page page){
        this.page=page;
        dataFromJson=new ReadDataFromJsonFile();
    }
    String usernameBox="#username";
    String passwordBox="#password";
String loginButton="#login";

public void login() throws Exception{
//    page.fill(usernamebox,username);
//    page.fill(passwordbox,password);
    page.type(usernameBox,dataFromJson.readValueFromJson("Username"));
    page.type(passwordBox,dataFromJson.readValueFromJson("Password"));
    page.click(loginButton);
}
}