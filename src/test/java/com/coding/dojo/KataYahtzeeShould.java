package com.coding.dojo;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class KataYahtzeeShould {

    @Test
    public void test_with_AssertJ (){
        assertThat("foo").isEqualTo("foo");
    }

    @Test
    public void test_with_JUnit(){
        assertEquals("foo", "foo");
    }

    @Test
    public void test_with_JUnit_matcher(){
        Assert.assertThat("foo", is("foo"));
    }

}