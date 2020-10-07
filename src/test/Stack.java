package test;

public class Stack {

   private char[] stack; // Should use char array instead of strings 
   private int top;
   
   public Stack(int size) {
      stack = new char[size];
      top = -1;
   }
   
   public void push(char data) { // add data into stack
      stack[++top] = data;
   }

   public char pop() { // remove data from the stack 
      return stack[top--];
   }
}