package com.jsp.pack1;

public class Demo {
    int defaul=1;          // only within the package
    private int privat=2;  // only within the class or outside the class using public method
    public int pub=3;   // throughout the project
    protected int protect=4; // within the same package or outside the package in the baseclass
}

/*
** In pack2 Memo class will access only the public members
** Memo cant access the private and default members
** Memo can access the protected members by using IS-A Relationship(Inheritance).
 Just we need to extend the Memo class with Demo class to access
 the protected members
** Without extending cant access the protected members outside the package.


 */

