package io.kraftapps.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Every valid email consists of a local name and a domain name,
 * separated by the '@' sign. Besides lowercase letters,
 * the email may contain one or more '.' or '+'.
 * <p>
 * For example, in "alice@leetcode.com", "alice" is the local name,
 * and "leetcode.com" is the domain name.
 * <p>
 * If you add periods '.' between some characters in the local name part
 * of an email address, mail sent there will be forwarded to the same address
 * without dots in the local name. Note that this rule does not apply to domain
 * names.
 * <p>
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward
 * to the same email address.
 * <p>
 * If you add a plus '+' in the local name, everything after the first plus
 * sign will be ignored. This allows certain emails to be filtered.
 * Note that this rule does not apply to domain names.
 * <p>
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 * <p>
 * It is possible to use both of these rules at the same time.
 * <p>
 * Given an array of strings emails where we send one email to each emails[i],
 * return the number of different addresses that actually receive mails.
 */

public class UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {
        int counter =0;
        Map<String, Set<String>> localToDomain = new HashMap<>();
        for (String email : emails) {
            String[] normalizedEmails = normalize(email);

            String local = normalizedEmails[0];
            String domain = normalizedEmails[1];
            Set<String> emailsForDomain = localToDomain.get(domain);
            if (emailsForDomain == null) {
                emailsForDomain = new HashSet<>();
                localToDomain.put(domain, emailsForDomain);
            }
            if(emailsForDomain.add(local)){
                counter++;
            }

        }
        return counter;
    }

    private String[] normalize(String emailId){
        StringBuilder str = new StringBuilder();
        int indexOfAtTheRate = emailId.lastIndexOf("@");

        for(int i=0;i<indexOfAtTheRate;i++){
            char c = emailId.charAt(i);
            if(c=='+') break;
            if(c=='.') continue;
            str.append(c);
        }
        return new String[]{str.toString(), emailId.substring(indexOfAtTheRate+1)};


    }
}
