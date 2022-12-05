package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackerTest {

    @Test
    public void shouldIfAmountUnderLimitBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountLessLimitBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountEqualsBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}