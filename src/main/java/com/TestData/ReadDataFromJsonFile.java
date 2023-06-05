package com.TestData;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJsonFile {
    public String readValueFromJson(String attribute){
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader(System.getProperty("user.dir")+ "/src/main/resources/readingdata.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject)obj;
        String value = jsonObject.get(attribute).toString();
        return value;

    }
}
