package io.kraftapps.leetcode.easy;

/**
 * Write a function to find the longest common prefix string amongst an
 * array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs.length; i++){
            strs[0].substring(1,strs[0].length()-1);

        }
        return null;

    }
}

