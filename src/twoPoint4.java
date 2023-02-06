/*
* two point algorithm
* 0과 1로 구성된 길이가 n인 수열
* 최대 k번을 0을 1로 변경 가능
* 1로만 구성된 최대 길이의 연속부분수열 찾기
* */

import java.util.Scanner;

public class twoPoint4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        twoPoint4 t = new twoPoint4();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,k,arr));
    }

    public int solution(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}
