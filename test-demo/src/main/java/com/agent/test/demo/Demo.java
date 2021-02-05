package com.agent.test.demo;


/**
 * Created by qinmp on 2017/5/12.
 */
public class Demo {

    public static void main(String[] args){
        System.out.println("Demo main 执行 ");
        Source source = new Source();
        Target target = new Target();
        source.hello("abc");
        target.hello("efg");
    }
}
