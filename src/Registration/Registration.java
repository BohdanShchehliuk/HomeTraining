package Registration;

import Data_registraited_clients.Clients;

import java.util.ArrayList;
import java.util.HashMap;

public class Registration {

    public Registration(ArrayList<String> enterData) {
        checkForRegistration(enterData);

    }

    public boolean checkForRegistration(ArrayList<String> enterData){
        Clients client = new Clients();



        if (!client.equals(null)&&client.clients.containsKey(enterData.get(1))){
            System.out.println("Користувач з таким логіном уже існує");
            return true;
        } else {
            System.out.println("Ай молодець!");
          client.clients.put(enterData.get(1),enterData.get(1));
        }

        return true;
    }
}
