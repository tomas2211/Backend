package Downloading;

import Parsing.Parser;
import Parsing.ResponseObjects.ResponseMain;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.ws.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

/**
 * Downloader
 */
public class Downloader {
    private static String dataURL = "https://api.pripoj.me/message/get/";
    private static String token = "7TOEYELOrQpsJRhVQLRtnCaheigkWmX2";
    private static final int limit = 100;

    static private String downloadData(String eui, int limit, int offset) {
        String url = dataURL + eui + "?token=" + token + "&limit=" + limit + "&offset="+offset;
        String ret = null;
        try {

            URL urlObj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) urlObj.openConnection();
            InputStream ins = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ins));

            ret = br.readLine();

            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("shit");
        }

        return ret;
    }

    public static ResponseMain downloadAll(String eui){
        int off = limit;
        ResponseMain rm = Parser.parse(downloadData(eui,limit,0));

        while(rm.NoOfRecords() >= off){
            rm.mergeWith(Parser.parse(downloadData(eui,limit,off)));
            off += limit;
        }
        return rm;

    }

}
