package com.practice.fundamentals;//package com.practice.fundamentals;
import sun.java2d.pipe.SolidTextRenderer;

import java.util.Arrays;
//
//interface Computer1{
//    void code();
//}
//class Lap implements Computer1{
//    public void code(){
//        System.out.println("Helps to code in moderate speed");
//    }
//}
//class Desk implements Computer1{
//    public void code(){
//        System.out.println("Helps to code faster");
//    }
//}
//class Person{
//    public void devApp(Computer1 comp){
//        comp.code();
//    }
//}
//public class Sample{
//    public static void main(String[] args)
//    {
//        Lap lap = new Lap();
//        Desk desk = new Desk();
//
//        Person obj = new Person();
//        obj.devApp(lap);
//        obj.devApp(desk);
//    }
//}



//import java.util.Scanner;
//
//public class Sample
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//    }
//}

//public class Sample extends Thread
//{
//    public static void main(String[] args)
//    {
//        Sample thread = new Sample();
//        thread.start();
//
//
//        System.out.println("THis is outside thread");
//    }
//    public void run(){
//        System.out.println("This is inside thread");
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//class Counter
//{
//    int count;
//    public synchronized void increment()  // Synchronized is used to fetch one value at a time to provide a meaningful proper output
//    {
//        count ++;
//    }
//}
//public class Sample
//{
//    public static void main(String[] args) throws InterruptedException {
//        Counter c = new Counter();
//        Runnable obj1 = () ->
//        {
//            for (int i = 0; i <= 1000; i ++){
//                c.increment();
//            }
//        };
//        Runnable obj2 = () ->
//        {
//            for (int i = 0; i <= 1000; i ++)
//            {
//                c.increment();
//            }
//        };
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(c.count);
//    }
//}
//
//class Thread1 extends Thread
//{
//    public void run()
//    {
//        System.out.println("THis is in a thread");
//        try {
//            Thread.sleep(10);   // It will delay the execution by 10 milliseconds
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//class Thread2 extends Thread
//{
//    public void run()
//    {
//        System.out.println("This is in second thread");
//    }
//}
//public class Sample{
//    public static void main(String [] args){
//        int target = 7;
//
//        List<Integer> result = new ArrayList<>();
//        int [] ans = {0, 0};
//
//        int[] arr = {1, 2, 4, 5, 21, 3, 12};
//        for(int i = 0; i < arr.length; i ++){
//            for (int j = i+1; j < arr.length; j ++)
//            {
//                if (arr[i] + arr[j] == target)
//                {
//                    ans[0] = i;
//                    ans[1] = j;
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ans));
//    }
//}


//Linked list
//class Node
//{
//    int data;
//    Node next;
//}
//class LinkList
//{
//    Node head;
//
//    public void insert(int data)
//    {
//        Node node = new Node();
//
//        node.data = data;
//        node.next = null;
//
//        if (head == null)
//        {
//            head = node;
//        }
//        else
//        {
//            Node n = head;
//
//            while(n.next != null)
//            {
//                n = n.next;
//            }
//            n.next = node;
//        }
//    }
//    public void show()
//    {
//        Node node = head;
//
//        while (node.next != null)
//        {
//            System.out.println(node.data);
//            node = node.next;
//        }
//        System.out.println(node.data);
//    }
//}
//public class Sample
//{
//    public static void main(String[] args)
//    {
//        LinkList list = new LinkList();
//
//        list.insert(45);
//        list.insert(43);
//        list.insert(42);
//        list.insert(41);
//
//        list.show();
//    }
//}

public class Sample{
    public static void main(String[] args)
    {

    }
}















