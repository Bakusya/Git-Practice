package testy;

import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class TestConvert {
    Toyota camry = new Toyota(3.5,"black","Camry50",2021,false,35000.0,"automate");
    @Test
    public void convert(){
        System.out.println(camry.convertToSom(84.5));
        double actualResult = camry.convertToSom(84.5);
        Assert.assertEquals(2957500,actualResult, 1);
    }
}
