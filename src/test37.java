import java.util.Scanner;
import java.util.Stack;

/*
* stack
* 괄호가 입력되면 올바른 괄호이면 예스 아니면 노
*
* */
public class test37 {

    public static void main(String[] args) {
        test37 t = new test37();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(t.solution(s));
    }

    public String solution(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x :
                s.toCharArray()) {
            if (x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop(); //맨 나중에 들어간거 꺼내기
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
