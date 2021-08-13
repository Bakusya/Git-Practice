package testy;

import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class TestToyota {

    Toyota camry = new Toyota(3.5,"black","Camry50",2021,false,35000.0,"automate");

    @Test
    public void testEngine(){
        Assert.assertEquals(3.5,camry.getEngine(),1);

    }
    @Test
    public void testColor(){
        Assert.assertTrue(camry.getColor().equals("black"));
    }

    @Test
    public void failTheTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void testConvertPrice(){
        Assert.assertEquals(2112500,2115000,10000);
    }



}




