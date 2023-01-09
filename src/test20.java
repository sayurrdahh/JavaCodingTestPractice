import java.util.Scanner;

/*
* 등수구하기
*
* */

public class test20 {

    public int[] solution(int n, int[] score){
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(score[j]>score[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        test20 T = new test20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        for (int x:
             T.solution(n, score)) {
            System.out.print(x + " ");
        }

    }
}
