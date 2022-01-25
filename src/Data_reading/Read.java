package Data_reading;

import Check.Check;

import java.io.*;
import java.util.ArrayList;

public class Read {
    private int maxNumberOfrows = 9;

    private  ArrayList<String> enterData;

    public  ArrayList<String> getEnterData() {
        return enterData;
    }

    public Read(String pathEnter) throws IOException {

        File file = new File(pathEnter);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        enterData = new ArrayList<>();
        for (int i = 0; i < maxNumberOfrows; i++) {
            enterData.add(br.readLine());
        }
        System.out.println(enterData);

        Check check = new Check(enterData);

    }
}
