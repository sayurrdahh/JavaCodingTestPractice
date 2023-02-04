import java.util.Scanner;
import java.util.Stack;

//괄호 안에 있는 문자 제거
//stack

public class test38 {

    public static void main(String[] args) {
        test38 t = new test38();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(t.solution(s));
    }

    public String solution(String s){
        String answer= "";
        Stack<Character> stack = new Stack<>();
        for (char x :
                s.toCharArray()) {
            if(x==')'){
                while(stack.pop() != '(');
            }else stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }

}
