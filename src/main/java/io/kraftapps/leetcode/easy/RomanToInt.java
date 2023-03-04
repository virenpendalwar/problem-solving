package io.kraftapps.leetcode.easy;

import java.util.*;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII.
Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
 */
public class RomanToInt {

    public int romanToInt1(String s) {
        String upperInput = s.toUpperCase();
        if (s == null || upperInput.length() == 0) {
            return 0;
        }
        char[] chars = upperInput.toCharArray();

        int num = 0;
        Queue<Character> queue = new LinkedList<>();
        for (char aChar : chars) {
            queue.add(aChar);
        }
        Character firstElement = queue.peek();
        Character currentElement = firstElement;
        Character prevElement = currentElement;
        while (currentElement != null) {
            currentElement = queue.poll();
            if (currentElement == null) {
                break;
            }
            if (currentElement == 'I') {
                num = num + 1;
            }

            if (currentElement == 'V') {
                num = num + 5;
                if (prevElement == 'I') {
                    num = num - 2;
                }
            }
            if (currentElement == 'X') {
                num = num + 10;
                if (prevElement == 'I') {
                    num = num -2;
                }
            }

            if (currentElement == 'L') {
                num = num + 50;
                if (prevElement == 'X') {
                    num = num - 20;
                }
            }

            if (currentElement == 'C') {
                num = num + 100;
                if (prevElement == 'X') {
                    num = num - 20;
                }
            }

            if(currentElement == 'D'){
                num = num + 500;
                if (prevElement == 'C') {
                    num = num - 200;
                }
            }


            if(currentElement == 'M'){
                num = num + 1000;
                if (prevElement == 'C') {
                    num = num - 200;
                }
            }
            prevElement = currentElement;
        }


        return num;
    }
    public int romanToInt(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int answer = romanValues.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0; i--){
            if(romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))){
                answer -= romanValues.get(s.charAt(i));
            }else{
                answer += romanValues.get(s.charAt(i));
            }

        }
        return answer;
    }

}
