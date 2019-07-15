package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DriverTest {

    private static Driver driver;

    @BeforeAll
    public static void init(){
        driver=new Driver();
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_age_over_18(){
        //given
        driver.setAge(19);

        //when
        Boolean actual=driver.isLegalDriver();

        //then
        Assertions.assertEquals(true,actual);

    }

    @Test
    public void should_return_false_when_call_checkDriver_given_age_less_18(){
        //given
        driver.setAge(17);

        //when
        Boolean actual=driver.isLegalDriver();

        //then
        Assertions.assertEquals(false,actual);

    }

    @Test
    public void should_return_true_when_call_checkDriver_given_age_equal_18(){
        //given
        driver.setAge(18);

        //when
        Boolean actual=driver.isLegalDriver();

        //then
        Assertions.assertEquals(true,actual);

    }

}
