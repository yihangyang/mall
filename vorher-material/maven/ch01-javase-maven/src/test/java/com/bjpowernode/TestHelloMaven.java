package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("****maven => testAdd()****");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10,20);
        // check (expectation, result)
        Assert.assertEquals(30, res);
    }

    @Test
    public void testAdd2(){
        System.out.println("####maven => testAdd2()###");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(30,20);
        // check (expectation, result)
        Assert.assertEquals(50, res);
    }

    @Test
    public void testAdd3(){
        System.out.println("####maven => testAdd3()###");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(50,20);
        // check (expectation, result)
        Assert.assertEquals(70, res);
    }
}