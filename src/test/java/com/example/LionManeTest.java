package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {

    private final String sex;
    static Feline feline;
    private final boolean expected;

    public LionManeTest(String sex, Feline feline, boolean expected) {
        this.sex = sex;
        this.feline = feline;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getLionSex() {
        return new Object[][]{
                {"Самец", feline, true},
                {"Самка", feline, false}
        };
    }

    @Test
    public void testDoesLionHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}