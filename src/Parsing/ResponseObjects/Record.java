package Parsing.ResponseObjects;

/**
 * Created by tomas on 12.9.16.
 */
public class Record {
    public String devEUI;
    public String payloadHex;
    public String createdAt;

    @Override
    public String toString() {
        return createdAt+" -> "+payloadHex;
    }
}
