import java.util.Scanner;
import java.util.Stack;
//stack
//쇠막대기
//() 는 레이저


public class stack5 {


    public static void main(String[] args) {
        stack5 t = new stack5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }
}
