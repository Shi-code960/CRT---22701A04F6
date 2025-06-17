import java.util.*;
class Main {
    public static void main(String[] args) {
      Stack<Integer>s=new Stack<Integer>();
       s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println("elements in the stack:");
        System.out.println(s);
    }

    public static void pushBottom(Stack<Integer>stack,int ele){
        if(stack.isEmpty()){
           
            return;
        }
        int val=stack.pop();
      
        stack.push(val);
    }
}