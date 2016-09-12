package Downloading;

import sun.misc.IOUtils;

import javax.net.ssl.HttpsURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

/**
 * Created by tomas on 12.9.16.
 */
public class Downloader {
    private static String dataURL = "https://api.pripoj.me/message/get/";
    private static String token = "7TOEYELOrQpsJRhVQLRtnCaheigkWmX2";

    static public String downloadData(String eui) {
        String url = dataURL + eui + "?token=" + token;

        try {

            URL urlObj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) urlObj.openConnection();
            InputStream ins = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ins));


            for (int i = 0;i <20;i++)
            {
                System.out.println(br.readLine());
            }

            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Nil";
    }

}
