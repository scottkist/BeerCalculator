package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimingSugarTest {

    private PrimingSugar primingSugar;

    @Before
    public void setUp() {
        primingSugar = new PrimingSugar("IPA",5,68,"Corn Sugar",2.3);
    }

    //Set up a Basic Unit Test, so I can create some later.
    @Test
    public void itIsNotNull() {
        Assert.assertNotNull(primingSugar);
    }

//    @Test
//    public void primingSugarTest() {
//        Assert.assertEquals("1", primingSugar.calcAmountOfPrimingSugar());
//    }

}
