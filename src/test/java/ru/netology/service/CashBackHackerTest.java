package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashBackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @Test
    public void shouldIfAmountUnderLimitBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountLessLimitBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountEqualsBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}