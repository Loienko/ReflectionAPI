package net.ukr.dreamsicle.Lesson2XMLandJSON.JSONExample;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Yura on 18.04.2017.
 */
public class JSONRunner {
    public static void main(String[] args) {
        String request = "http://query.yahooapis.com/v1/public/yql?format=json&q=select * from yahoo.finance" +
                ".xchange where pair in (\"USDEUR\",\n" + "\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

        String result = performRequest(request);

        Gson gson = new GsonBuilder().create();
        JSON json =(JSON) gson.fromJson(result, JSON.class);

        /*for (Rate rate : json.query.results.rate) {
            System.out.println(rate.id + "=" + rate.Rate);
        }*/

        System.out.println("JSON: \n\t" + gson.toJson(json));

    }

    private static String performRequest(String request) {
        return request;
    }


}
