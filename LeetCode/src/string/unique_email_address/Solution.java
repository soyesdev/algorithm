package string.unique_email_address;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email: emails) {
            String[] parts = email.split("@");
            String localName = parts[0].replace(".", "").split("\\+")[0];
            emailSet.add(localName + "@" + parts[1]);
        }
        return emailSet.size();
    }
}
