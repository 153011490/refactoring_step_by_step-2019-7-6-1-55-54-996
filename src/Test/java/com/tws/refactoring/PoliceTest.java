package com.tws.refactoring;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PoliceTest {

    public static Police police;

    @BeforeAll
    public static void init_police(){
        police=new Police();
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_age_over_18(){
        //given
        Driver driver=new Driver(19);

        //when
        Boolean actual=police.checkDriver(driver);

        //then
        Assertions.assertEquals(true,actual);

    }

    @Test
    public void should_return_false_when_call_checkDriver_given_age_less_18(){
        //given
        Driver driver=new Driver(17);

        //when
        Boolean actual=police.checkDriver(driver);

        //then
        Assertions.assertEquals(false,actual);

    }

    @Test
    public void should_return_true_when_call_checkDriver_given_age_equal_18(){
        //given
        Driver driver=new Driver(18);

        //when
        Boolean actual=police.checkDriver(driver);

        //then
        Assertions.assertEquals(true,actual);

    }

}
