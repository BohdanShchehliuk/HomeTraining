package Check;

import Registration.Registration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.zip.InflaterOutputStream;

public class Check {

    private String[] keyWords = {"registration", "data_renewal", "data_password", "obtaining_information"};
    private String keywords;
    ArrayList<String> enterData;

    public Check(ArrayList<String> enterData) {
        this.enterData = enterData;
        this.keywords = checking_key_request(enterData);
        command(keywords);
    }

    public String checking_key_request(ArrayList<String> enterData) {
        for (String k : keyWords) {
            if (k.equals(enterData.get(0))) {
                System.out.println("Ваша команда " + enterData.get(0));
                return enterData.get(0);
            }
        }
        System.out.println("Відсутнє правильне слово-команда");
        return null;
    }

    public void command(String keywords) {
        if (keywords.equals("registration")) {
          Registration registration  = new Registration(enterData);
        }

    }
}

