package com.juaracoding.ujiandua;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAccount {


    @Test
    @Parameters({"amt"})
    public void test(double amt){
        Account account = new Account();
        double actual = account.deposit(50000.0);
        double expect = 50000.0;
        Assert.assertEquals(actual,expect);
    }


}
