package com.cdac.abstractLearn;

public class LearnAnonymous {
    public static void main(String[] args) {
        
        // 1. Anonymous class extending OuterClass
        OuterClass obj = new OuterClass() {    
//            public void sing() {
//                System.out.println("sing");
//            }
            
            @Override
            public void outerMethod() { // Fixed case: outerMethod (not outermethod)
                System.out.println("outermethod22");
            }
        };
        
        obj.outerMethod();
        // Note: obj.sing() won't work here because the reference type is OuterClass
        
        // 2. Anonymous class implementing an Interface
        superinterface obj2 = new superinterface() {
            @Override
            public void interfaceMethod() {   
                System.out.println("i am interface anonymous");
            }
        };
        
        obj2.interfaceMethod();
    }
}




class OuterClass {
    public void outerMethod() {
        System.out.println("outermethod");
    }
}

interface superinterface {
    void interfaceMethod();
}

