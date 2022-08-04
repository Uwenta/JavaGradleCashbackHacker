package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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

    @Test
    public void test2IfAmountMore1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(5300);
        int expected = 700;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void test2IfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(550);
        int expected = 450;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2IfAmountEquals1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
