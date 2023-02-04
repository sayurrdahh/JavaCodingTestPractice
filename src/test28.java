/*
* n개의 수로 이루어진 수열
* 연속 부분 수열의 합이 특정 숫자 m 이 되는 경우가 몇번 있는지 구하기
* */

import java.util.Scanner;

public class test28 {

    public static void main(String[] args) {
        test28 t = new test28();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,m,arr));
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0, lt = 0,sum = 0;
        for(int rt=0; rt<n; rt++)
        {
            sum += arr[rt];
            if(sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m) answer++;

            }
        }

        return answer;
    }
}
