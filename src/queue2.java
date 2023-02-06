//교육과정 설계
//queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue2 {

    public static void main(String[] args) {
        queue2 t = new queue2();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(t.solution(a,b));
    }

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x :
                need.toCharArray()) {
            q.offer(x);
        }
        for (char x :
                plan.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) return "NO";
            }
        }
        if (!q.isEmpty()) return "NO";

        return answer;
    }
}
