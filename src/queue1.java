import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* queue
* 선입선출
* offer
* poll
* */

public class queue1 {

    public static void main(String[] args) {

        queue1 t = new queue1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(t.solution(n,m));
    }

    public int solution(int n, int m){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            for (int i = 1; i < m; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }

        return answer;
    }
}
