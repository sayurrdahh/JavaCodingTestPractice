/*
* n일 동안 매출기록 연속된 k일 동안의 최대 매출액
* sliding window
* */

import java.util.Scanner;

public class slidingWindow {

    public int solution(int n, int k, int[] arr){
        int answer,sum = 0;
        for(int i=0; i<k ; i++) sum+=arr[i];
        answer = sum ;
        for (int i = k; i < n; i++) {
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer,sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        slidingWindow t = new slidingWindow();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,k,arr));
    }
}
