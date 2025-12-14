//package1/BaseClass.java
package package1;

public class BaseClass {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;  
    private int privateVar = 4;

    public void printVars() {
        System.out.println("BaseClass:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("privateVar = " + privateVar);
    }
}

//package1/SubClass.java
package package1;

public class SubClass extends BaseClass {
    public void accessFromSubClass() {
        System.out.println("SubClass (наследник в том же пакете):");
        System.out.println("publicVar = " + publicVar);           // доступно
        System.out.println("protectedVar = " + protectedVar);     // доступно
        System.out.println("defaultVar = " + defaultVar);         // доступно
        // System.out.println("privateVar = " + privateVar);      // ошибка!
    }
}

//package2/OtherClass.java
package package2;

import package1.BaseClass;

public class OtherClass {
    public void accessFromOtherClass() {
        BaseClass base = new BaseClass();
        System.out.println("OtherClass (другой пакет, не наследник):");
        System.out.println("publicVar = " + base.publicVar);      // доступно
        // System.out.println("protectedVar = " + base.protectedVar); // ошибка!
        // System.out.println("defaultVar = " + base.defaultVar);      // ошибка!
        // System.out.println("privateVar = " + base.privateVar);      // ошибка!
    }
}

//package2/SubClassInOtherPackage.java
package package2;

import package1.BaseClass;

public class SubClassInOtherPackage extends BaseClass {
    public void accessFromSubClassInOtherPackage() {
        System.out.println("SubClass в другом пакете:");
        System.out.println("publicVar = " + publicVar);           // доступно
        System.out.println("protectedVar = " + protectedVar);     // доступно (наследование)
        // System.out.println("defaultVar = " + defaultVar);      // ошибка! default не виден вне пакета
        // System.out.println("privateVar = " + privateVar);      // ошибка!
    }
}