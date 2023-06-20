package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void CashbackTest() {
        assertEquals(0, cashbackHackService.remain(-200));
    }
    @Test
    public void CashbackTest1() {
        assertEquals(0, cashbackHackService.remain(0));
    }

    @Test
    public void CashbackTest2() {
        assertEquals(999, cashbackHackService.remain(1));
    }

    @Test
    public void CashbackTest3() {
        assertEquals(1, cashbackHackService.remain(999));
    }

    @Test
    public void CashbackTest4() {
        assertEquals(0, cashbackHackService.remain(1000));
    }
}
