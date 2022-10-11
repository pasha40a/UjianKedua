package com.juaracoding.ujiandua;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAccount {

    @Test
    @Parameters({"a"})
    public void testInsertAccountNo(int a){
        Account account = new Account();
        int actual = account.insertAcc_no(a);
        int expect = 10;
        Assert.assertEquals(actual,expect);
    }

    @Test
    @Parameters({"amt"})
    public void test(double amt){
        Account account = new Account();
        double actual = account.deposit(amt);
        double expect = 50000.0;
        Assert.assertEquals(actual,expect);
    }
//
//    @Test
//    @Parameters({"amt"})
//    public void tesWithDraw(double amt){
//        Account account = new Account();
//        Main main = new Main();
//        main.setAmount(amt);
//        String actual = "Insufficient Balance";
//        String expect = "Insufficient Balance";
//        Assert.assertEquals(actual,expect);
//    }
//    @Test
//    @Parameters({"amt"})
//    public void tesWithDrawFalse(double amt){
//        Account account = new Account();
//        Main main = new Main();
//        main.setAmount(amt);
//        String actual = amt + " withdrawn";
//        String expect = amt + " withdrawn";
//        Assert.assertEquals(actual,expect);
//    }

}
