package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void testWhenAllCorrect() {

        int actual = service.remain(600);
        int expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase1() {

        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase999() {

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase1000() {

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase1001() {

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenPurchase2001() {

        int actual = service.remain(2001);
        int expected = 999;
        assertEquals(expected, actual);
    }

}