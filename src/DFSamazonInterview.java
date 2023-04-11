//합이 같은 부분 집합

/*
* n개의 원소로 구성된 자연수 집합이 주어지면,
* 이 집합을 두 개의 부분 집합으로 나누었을 때
* 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 yes 아니면 no
* */

import java.util.Scanner;

public class DFSamazonInterview {

    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr) {

        if(flag) return;
        if(sum > total/2) return;
        if(L == n){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
            }
        } else {
           DFS(L+1, sum+arr[L], arr);
           DFS(L+1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DFSamazonInterview T = new DFSamazonInterview();
        n = sc.nextInt();
        int[] arr = new int[n];
        //int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
