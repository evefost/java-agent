package com.agent.test.demo;

public class Source {

    public String hello(String name) {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        return "abc";
    }
}