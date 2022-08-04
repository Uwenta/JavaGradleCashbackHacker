package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(5300);
        int expected = 700;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(550);
        int expected = 450;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfAmountEquals1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
