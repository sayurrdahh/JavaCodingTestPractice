/*
 * 연속된 자연수의 합 가짓수 구하기
 * 수학
 * */

import java.util.Scanner;

public class naturalNumberSum {

    public int solution(int n){
        int answer = 0, cnt=1;
        //cnt는 연속된 자연수의 개수
        n--;
        while(n>0){
            cnt++;
            n = n - cnt;
            if(n%cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        naturalNumberSum t = new naturalNumberSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(t.solution(n));
    }
}
