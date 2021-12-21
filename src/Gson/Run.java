package Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) throws IOException {
        String request = "https://data.gov.ua/dataset/46a11f17-0573-4fbc-9e38-cd95c4057ee2/resou" +
                "rce/37bb2299-94f9-46bb-a514-7637359aeaac/download/perelik-ob-iektiv-komunalnoyi-vlasnosti-shcho-peredani-v-orendu.json";
        String resalt = performRequest(request);

        Gson gson = new GsonBuilder().create();
        Type type = new TypeToken<ArrayList<Query>>() {
        }.getType();
        List<Query> guerise = gson.fromJson(resalt, type);
        // основне - правильно прописати анотації
        guerise.stream().forEach(System.out::println);
        System.out.println(guerise);
    }
// метод, який перетворює URL у стрінгу
    private static String performRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }
        return sb.toString();
    }
}
