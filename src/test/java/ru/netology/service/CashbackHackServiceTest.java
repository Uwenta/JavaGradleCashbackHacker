package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(5300);
        int expected = 700;

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void testIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(550);
        int expected = 450;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountEquals1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}
