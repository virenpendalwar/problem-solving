package io.kraftapps.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueEmailAddressTest {

    private UniqueEmailAddress uniqueEmailAddress;

    @Before
    public void setup(){
        uniqueEmailAddress = new UniqueEmailAddress();
    }

    @Test
    public void testUniqueEmailAddress_input1(){
        assertEquals(3, uniqueEmailAddress.numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
    }

    @Test
    public void testUniqueEmailAddres_inpu2(){
        assertEquals(2, uniqueEmailAddress.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

}