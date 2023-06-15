package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackTest {
    @Test
    public void CashbackTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(-200), 0);
    }

    @Test
    public void CashbackTest1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(0), 0);
    }

    @Test
    public void CashbackTest2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(1), 999);
    }

    @Test
    public void CashbackTest3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(999), 1);
    }

    @Test
    public void CashbackTest4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(1000), 0);
    }
}