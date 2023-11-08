package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain600() {
        int actual = service.remain(1400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0() {
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(expected, actual);
    }
  
}