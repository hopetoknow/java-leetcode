package com.hopetoknow._0929_unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] names = email.split("@");

            names[0] = names[0].replace(".", "");

            if (names[0].contains("+")) {
                int plusIndex = names[0].indexOf("+");
                names[0] = names[0].substring(0, plusIndex);
            }

            set.add(String.join("@", names));
        }

        return set.size();
    }

    public int numUniqueEmails2(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] names = email.split("@");
            String localName = names[0].replace(".", "");
            String domainName = names[1];
            int plusIndex = localName.indexOf('+');

            if (plusIndex != -1) {
                localName = localName.substring(0, plusIndex);
            }

            set.add(localName + "@" + domainName);
        }

        return set.size();
    }

    public int numUniqueEmails3(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] names = email.split("@");
            String localName = names[0].split("\\+")[0].replace(".", "");
            set.add(localName + "@" + names[1]);
        }

        return set.size();
    }
}
