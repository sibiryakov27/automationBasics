package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain600() {
        int actual = service.remain(1400);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0() {
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}