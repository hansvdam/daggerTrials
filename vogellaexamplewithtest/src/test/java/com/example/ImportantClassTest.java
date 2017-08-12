package com.example;

import org.junit.Rule;
import org.junit.Test;

public class ImportantClassTest {

public class MainServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock MyRestService restService;

    @Mock MyLogger logger;

    @InjectMocks ImportantClass importClassToBeTested;

    @Test
    public void performShouldWriteOutput() {
        when(restService.getData()).thenReturn("abc");

        importClassToBeTested.perform();

        verify(logger).print("ABC");
    }
}
}