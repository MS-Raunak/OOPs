package com.jsp.pack2;

import com.jsp.pack1.Demo;

/**
* Without extending we can access only public members here from
  Demo class of pack2
**/

/*
public class Memo {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Public Member: "+ d.pub); // pub is public in Demo class
    }
}
 */

/**
 * Let's extend the Memo class with Demo class to access protected
  members
**/

public class Memo extends Demo {
    public static void main(String[] args) {
        Memo memo = new Memo();
        System.out.println("Public Member: "+ memo.pub);// pub is public in Demo
        System.out.println("Protected Member: "+memo.protect);// protect is protected in Demo
    }
}

