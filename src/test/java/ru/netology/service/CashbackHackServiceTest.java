package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testWhenAllCorrect() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWhenPurchase0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWhenPurchase1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWhenPurchase999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWhenPurchase1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWhenPurchase1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWhenPurchase2001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2001);
        int expected = 999;
        Assert.assertEquals(actual,expected);
    }

}