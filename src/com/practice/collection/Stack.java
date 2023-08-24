package com.practice.collection;

public class Stack
{
    int [] stack = new int [5];
    int top = 0;

    public void push(int data)
    {
        if (top == 5)
        {
            System.out.println("Stack is full");
        }
        else {
            stack[top] = data;
            top++;
        }
    }
    public int pop()
    {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek()
    {
        int data;
        data = stack[top - 1];
        return data;
    }
    public int size()
    {
        return(top);
    }
    public void show()
    {
        for (int n:stack)
        {
            System.out.print(n + " ");
        }
    }
}
class Run
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(12);
        stack.push(12);



        int pop_element = stack.pop();
        stack.pop();

        int peek_element = stack.peek();

        System.out.println(pop_element);
        System.out.println(peek_element);
        System.out.println(stack.size());
        stack.show();
    }
}
