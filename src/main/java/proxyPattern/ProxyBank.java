package proxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {

    RealBank realBank = new RealBank();
    static List<String> bannedPerson;

    static {
        bannedPerson = new ArrayList<String>();
        bannedPerson.add("Alex");
        bannedPerson.add("David");
        bannedPerson.add("Williams");
    }


    @Override
    public void withdraw(String clientName) throws Exception {
        if (bannedPerson.contains(clientName)) {
            throw new Exception(clientName + " is not authorized to access the bank");
        } else {
            System.out.println(clientName + " is withdrawing some cash");
        }
    }
}
