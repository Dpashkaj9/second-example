import examples.PackageExample;

import java.util.Scanner;

public class SomeClass {

    public static classexample example = new classexample(4,"","");

    public static classexample secondexample=new classexample(7,"","");

    public static void main(String[] args) {

        example.setMaxSpeed(200);
        example.setMaxSpeed(250);
        secondexample.setMaxSpeed(300);
        example.setMaxSpeed(secondexample.getMaxSpeed());
        example.setBrand("smth");
        example.setColor("gray");
        //System.out.println(example.getMaxSpeed());
        //System.out.println(secondexample.getMaxSpeed());
        example.printAllFields();


        PackageExample packageExample = new PackageExample();
        packageExample.setSomeNumber(5);
        System.out.println(packageExample.getSomeNumber());
        //packageExample.printSomeNumber();


    }


}
