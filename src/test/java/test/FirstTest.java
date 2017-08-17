package test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Anton_Chyrko on 8/17/2017.
 */
public class FirstTest {
    @Test
    public void FT(){
        System.out.println("Hello");
        Assert.assertTrue(true);
    }
}
