package com.atguigu.java;


import java.util.ArrayList;

/**
 * @author mc
 * @date 2021-02-27 - 18:22
 *
 * IDEA中代码模板所处的位置：setting-editor-live templates/postfix completiom
 *2.常用模板
 *
 */
public class TemplatesTest {

    //模板六：prsf

    //private static final Coustomer cust  = new Coustomer();

    //psf
    public static final int NUM = 1;




    //模板一：psvm
    public static void main(String[] args) {


        //模板二：
        System.out.println("hello!");
        //变形：soutp/ soutm / soutv/ xxx.out
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");


        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        //模板三：fori
        String[] arr = new String[]{"tom","jerry","hanmeimei","lilei"};
        for (int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);

        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);

        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(arr[i]);

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //list.forr 倒序

    }

    public void method(){
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {

        }

        ///变形inn
        if (list != null) {
            
        }



    }

}
