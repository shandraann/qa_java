package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionManeExceptionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void lionHaveManeExceptionTest() throws Exception {
        new Lion("", feline);
    }

}