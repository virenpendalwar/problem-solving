package io.kraftapps.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    @Before
    public void setup(){
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void testRomanToInt_Input_1000(){
        assertEquals("M",integerToRoman.intToRoman(1000) );
    }

    @Test
    public void testRomanToInt_Input_900(){
        assertEquals("CM",integerToRoman.intToRoman(900) );
    }

    @Test
    public void testRomanToInt_Input_2000(){
        assertEquals("MM",integerToRoman.intToRoman(2000) );
    }

    @Test
    public void testRomanToInt_Input_1500(){
        assertEquals("MD",integerToRoman.intToRoman(1500) );
    }

    @Test
    public void testRomanToInt_Input_2500(){
        assertEquals("MMD",integerToRoman.intToRoman(2500) );
    }
/*
    @Test
    public void testRomanToInt_Input_II(){
        assertEquals("II",integerToRoman.intToRoman(2) );
    }

    @Test
    public void testRomanToInt_Input_III(){
        assertEquals(3,integerToRoman.intToRoman("III") );
    }

    @Test
    public void testRomanToInt_Input_IV(){
        assertEquals(4,integerToRoman.intToRoman("IV") );
    }

    @Test
    public void testRomanToInt_Input_V(){
        assertEquals(5,integerToRoman.intToRoman("V") );
    }

    @Test
    public void testRomanToInt_Input_VI(){
        assertEquals(6,integerToRoman.intToRoman("VI") );
    }

    @Test
    public void testRomanToInt_Input_VII(){
        assertEquals(7,integerToRoman.intToRoman("VII") );
    }

    @Test
    public void testRomanToInt_Input_VIII(){
        assertEquals(8,integerToRoman.intToRoman("VIII") );
    }

    @Test
    public void testRomanToInt_Input_IX(){
        assertEquals(9,integerToRoman.intToRoman("IX") );
    }

    @Test
    public void testRomanToInt_Input_X(){
        assertEquals(10,integerToRoman.intToRoman("X") );
    }

    @Test
    public void testRomanToInt_Input_XI(){
        assertEquals(11,integerToRoman.intToRoman("XI") );
    }

    @Test
    public void testRomanToInt_Input_XII(){
        assertEquals(12,integerToRoman.intToRoman("XII") );
    }

    @Test
    public void testRomanToInt_Input_XIII(){
        assertEquals(13,integerToRoman.intToRoman("XIII") );
    }

    @Test
    public void testRomanToInt_Input_XIV(){
        assertEquals(14,integerToRoman.intToRoman("XIV") );
    }

    @Test
    public void testRomanToInt_Input_XV(){
        assertEquals(15,integerToRoman.intToRoman("XV") );
    }

    @Test
    public void testRomanToInt_Input_XVI(){
        assertEquals(16,integerToRoman.intToRoman("XVI") );
    }

    @Test
    public void testRomanToInt_Input_XVII(){
        assertEquals(17,integerToRoman.intToRoman("XVII") );
    }

    @Test
    public void testRomanToInt_Input_XVIII(){
        assertEquals(18,integerToRoman.intToRoman("XVIII") );
    }

    @Test
    public void testRomanToInt_Input_XIX(){
        assertEquals(19,integerToRoman.intToRoman("XIX") );
    }

    @Test
    public void testRomanToInt_Input_XX(){
        assertEquals(20,integerToRoman.intToRoman("XX") );
    }

    @Test
    public void testRomanToInt_Input_XXI(){
        assertEquals(21,integerToRoman.intToRoman("XXI") );
    }

    @Test
    public void testRomanToInt_Input_XXII(){
        assertEquals(22,integerToRoman.intToRoman("XXII") );
    }

    @Test
    public void testRomanToInt_Input_XXIII(){
        assertEquals(23,integerToRoman.intToRoman("XXIII") );
    }

    @Test
    public void testRomanToInt_Input_XXIV(){
        assertEquals(24,integerToRoman.intToRoman("XXIV") );
    }

    @Test
    public void testRomanToInt_Input_XXV(){
        assertEquals(25,integerToRoman.intToRoman("XXV") );
    }

    @Test
    public void testRomanToInt_Input_XXVI(){
        assertEquals(26,integerToRoman.intToRoman("XXVI") );
    }

    @Test
    public void testRomanToInt_Input_XXVII(){
        assertEquals(27,integerToRoman.intToRoman("XXVII") );
    }

    @Test
    public void testRomanToInt_Input_XXVIII(){
        assertEquals(28,integerToRoman.intToRoman("XXVIII") );
    }

    @Test
    public void testRomanToInt_Input_XXIX(){
        assertEquals(29,integerToRoman.intToRoman("XXIX") );
    }

    @Test
    public void testRomanToInt_Input_XXX(){
        assertEquals(30,integerToRoman.intToRoman("XXX") );
    }

    @Test
    public void testRomanToInt_Input_XXXI(){
        assertEquals(31,integerToRoman.intToRoman("XXXI") );
    }

    @Test
    public void testRomanToInt_Input_XXXII(){
        assertEquals(32,integerToRoman.intToRoman("XXXII") );
    }

    @Test
    public void testRomanToInt_Input_XXXIII(){
        assertEquals(33,integerToRoman.intToRoman("XXXIII") );
    }

    @Test
    public void testRomanToInt_Input_XXXIV(){
        assertEquals(34,integerToRoman.intToRoman("XXXIV") );
    }

    @Test
    public void testRomanToInt_Input_XXXV(){
        assertEquals(35,integerToRoman.intToRoman("XXXV") );
    }

    @Test
    public void testRomanToInt_Input_XXXVI(){
        assertEquals(36,integerToRoman.intToRoman("XXXVI") );
    }

    @Test
    public void testRomanToInt_Input_XXXVII(){
        assertEquals(37,integerToRoman.intToRoman("XXXVII") );
    }

    @Test
    public void testRomanToInt_Input_XXXVIII(){
        assertEquals(38,integerToRoman.intToRoman("XXXVIII") );
    }

    @Test
    public void testRomanToInt_Input_XXXIX(){
        assertEquals(39,integerToRoman.intToRoman("XXXIX") );
    }

    @Test
    public void testRomanToInt_Input_XL(){
        assertEquals(40,integerToRoman.intToRoman("XL") );
    }

    @Test
    public void testRomanToInt_Input_XLI(){
        assertEquals(41,integerToRoman.intToRoman("XLI") );
    }

    @Test
    public void testRomanToInt_Input_XLII(){
        assertEquals(42,integerToRoman.intToRoman("XLII") );
    }

    @Test
    public void testRomanToInt_Input_XLIII(){
        assertEquals(43,integerToRoman.intToRoman("XLIII") );
    }

    @Test
    public void testRomanToInt_Input_XLIV(){
        assertEquals(44,integerToRoman.intToRoman("XLIV") );
    }

    @Test
    public void testRomanToInt_Input_XLV(){
        assertEquals(45,integerToRoman.intToRoman("XLV") );
    }

    @Test
    public void testRomanToInt_Input_XLVI(){
        assertEquals(46,integerToRoman.intToRoman("XLVI") );
    }

    @Test
    public void testRomanToInt_Input_XLVII(){
        assertEquals(47,integerToRoman.intToRoman("XLVII") );
    }

    @Test
    public void testRomanToInt_Input_XLVIII(){
        assertEquals(48,integerToRoman.intToRoman("XLVIII") );
    }

    @Test
    public void testRomanToInt_Input_XLIX(){
        assertEquals(49,integerToRoman.intToRoman("XLIX") );
    }

    @Test
    public void testRomanToInt_Input_L(){
        assertEquals(50,integerToRoman.intToRoman("L") );
    }

    @Test
    public void testRomanToInt_Input_LXI(){
        assertEquals(71,integerToRoman.intToRoman("LXXI") );
    }

    @Test
    public void testRomanToInt_Input_XC(){
        assertEquals(90,integerToRoman.intToRoman("XC") );
    }

    @Test
    public void testRomanToInt_Input_XCI(){
        assertEquals(91,integerToRoman.intToRoman("XCI") );
    }

    @Test
    public void testRomanToInt_Input_C(){
        assertEquals(100,integerToRoman.intToRoman("C") );
    }

    @Test
    public void testRomanToInt_Input_CD(){
        assertEquals(400,integerToRoman.intToRoman("CD") );
    }

    @Test
    public void testRomanToInt_Input_CM(){
        assertEquals(900,integerToRoman.intToRoman("CM") );
    }*/

}