package com.driver;


public class Main {
    static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    static class B extends  A{
        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {

        // creating the object of Class B and calling the  meth function of Class A from it
        B bobj = new B();
        String methA = bobj.meth();

        // printing the meth object
        // 1. when the method was not overridden (Output):- "Invoking method from class A"
        // 2. output after method override :- "Method is overridden in Extendend class B"
        System.out.println(methA);

        // calling the overriden method meth from class B object
        String methB = bobj.meth();

    }
  
}