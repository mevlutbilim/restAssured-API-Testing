package com.automation.tests.day6;

import org.junit.jupiter.api.BeforeAll;
import com.automation.utilities.ConfigurationReader;

public class SpartanTests {

    @BeforeAll
    public void  setup(){
        baseURI= ConfigurationReader.getProperty("spartan.uri");

    }
}
