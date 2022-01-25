package Main;

import Data_reading.Read;

import java.io.*;
import java.util.Map;

public class Main {
private static String pathEnter;
    public Map<String ,String> clients;

    public String getPathEnter() {
        return pathEnter;
    }

    public static void main(String[] args) throws IOException {
        pathEnter = "D:\\Users\\shchehlyuk-b-p\\Desktop\\JAVA\\HomeTraining\\src\\Data_from_servis\\ShehliukBohdan.txt";
        Read read = new Read(pathEnter);
        Read read1 = new Read(pathEnter);



    }


}


