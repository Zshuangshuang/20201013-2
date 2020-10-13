package java10_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-13
 * Time:20:04
 **/
public class Test {

    public static boolean matching(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if (stack.empty()){
                return false;
            }
            //此时的top代表栈顶的左括号
            Character top = stack.pop();
            //此时通过map.get(top)来找到对应的右括号，当前c代表第一个出现的右括号，如果map.get(top)和c“身份相同”，那么就继续进行出栈操作
            if (map.get(top) == c){
                continue;
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }
}
