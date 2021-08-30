package string.unique_email_address;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email: emails) {
            String[] name = email.split("@");
            String localName = name[0].replace(".", "").split("\\+")[0];
            emailSet.add(localName + "@" + name[1]);
        }
        return emailSet.size();
    }
}
