package Parsing;

import Parsing.ResponseObjects.ResponseMain;
import com.google.gson.Gson;

/**
 * Parser
 */
public class Parser {

    public static ResponseMain parse(String data){
        Gson gson = new Gson();


        return gson.fromJson(data, ResponseMain.class);

    }

}
