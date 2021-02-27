package com.atguigu.java;
/*3322313*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;


public class HelloWorld {


    private static int mun;

    public static void main(String[] args) {
        //region 声明
        System.out.println("helloworld!");
        System.out.println("helloworld!");
        ArrayList list1 = new ArrayList();
        //endregion

        ArrayList lis1 = null;


//        synchronized ()

        new Date();

        list1.add(0,123);
        
        //mehtod();

        System.out.println(list1);


    }

    public static void mehtod() {

        mun = 10;



        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
