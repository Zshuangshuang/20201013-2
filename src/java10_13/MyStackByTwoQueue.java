package java10_13;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-13
 * Time:20:40
 **/
public class MyStackByTwoQueue {
    private static Queue<Integer> A = new LinkedList<>();
    private static Queue<Integer> B= new LinkedList<>();

    public static void push(int x){
        A.offer(x);
    }
    public static Integer pop(){
        if (empty()){
            return null;
        }
        while(A.size() > 1){
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        swapAB();
        return ret;
    }
    private static void swapAB(){
        Queue<Integer> tmp = new LinkedList<>();
        tmp = A;
        A = B;
        B = tmp;
    }
    public static Integer top(){
        if (empty()){
            return null;
        }
        while(A.size() > 1){
            int tmp = A.poll();
            B.offer(tmp);
        }
        int ret = A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }
    public static boolean empty(){
        return (A.isEmpty() && B.isEmpty());
    }
}
