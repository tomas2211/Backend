package Downloading;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.misc.IOUtils;

import javax.net.ssl.HttpsURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

/**
 * Downloader
 */
public class Downloader {
    private static String dataURL = "https://a`pi.pripoj.me/message/get/";
    private static String token = "7TOEYELOrQpsJRhVQLRtnCaheigkWmX2";

    static public String downloadData(String eui) {
        String url = dataURL + eui + "?token=" + token;
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

}
