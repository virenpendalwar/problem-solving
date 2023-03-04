package io.kraftapps.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public String intToRoman(int num) {
        String ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousands[] = {"", "M", "MM", "MMM"};

        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }

    public String intToRomanFaster(int num) {
        StringBuilder str = new StringBuilder();
        while (num > 1000) {
            str.append("M");
            num -= 1000;
        }
        if (num >= 900) {
            str.append("CM");
            num -= 900;
        }
        if (num >= 500) {
            str.append("D");
            num -= 500;
        }
        if (num >= 400) {
            str.append("CD");
            num -= 400;
        }
        while (num > 100) {
            str.append("C");
            num -= 100;
        }
        if (num >= 90) {
            str.append("XC");
            num -= 90;
        }
        if (num >= 50) {
            str.append("L");
            num -= 50;
        }
        if (num >= 40) {
            str.append("XL");
        }
        while (num >= 10) {
            str.append("X");
            num -= 10;
        }
        if (num == 9) {
            str.append("IX");
            return str.toString();
        }
        if (num >= 5) {
            str.append("V");
            num -= 5;
        }
        if (num == 4) {
            str.append("IV");
            return str.toString();
        }
        while(num>=1){
            str.append("I");
            num-=1;
        }

        return str.toString();
    }


}
