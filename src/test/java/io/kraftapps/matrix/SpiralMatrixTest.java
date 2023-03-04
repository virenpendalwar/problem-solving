package io.kraftapps.matrix;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SpiralMatrixTest{

    private SpiralMatrix spiralMatrix;

    @Before
    public void setup(){
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    public void testWithMatrix1(){
        assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), new int[][]{{1,2,3}, {4,5,6}, {7,8,9}});

    }

    @Test
    public void testWithMatrix2(){
        assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});

    }

}