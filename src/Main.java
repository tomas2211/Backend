import Downloading.Downloader;
import Parsing.ResponseObjects.ResponseMain;

public class Main {

    public static void main(String[] args) {
        ResponseMain rm = Downloader.downloadAll("0004A30B001B8015");
        rm.printAll();
    }
}