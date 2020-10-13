package java10_13;

import java.util.Stack;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-13
 * Time:20:56
 **/
public class MyQueueByTwoStack {

    private static Stack<Integer> A = new Stack<>();
    private static Stack<Integer> B = new Stack<>();

    public static void push(int x){
        while(!B.empty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }
    public static Integer pop(){
        if (empty()){
            return null;
        }
        while (!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.pop();
    }
    public static Integer peek(){
        if (empty()){
            return null;
        }
        while (!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek();
    }
    public static boolean empty(){
        return (A.isEmpty() && B.isEmpty());
    }
}
