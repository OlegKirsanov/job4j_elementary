package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void answer() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }
}
