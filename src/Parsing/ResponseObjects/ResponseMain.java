package Parsing.ResponseObjects;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by tomas on 12.9.16.
 */
public class ResponseMain {
    List<Record> records;

    public void printAll(){
        for (Record r:records) {
            System.out.println(r);
        }
    }

    public void mergeWith(ResponseMain re){
        records.addAll(re.records);
    }

    public int NoOfRecords(){
        return records.size();
    }
}
