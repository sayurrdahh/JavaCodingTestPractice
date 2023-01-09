/*
* 피보나치 수열
* 1 1 2 3 5 8 ...
* */

import java.util.Scanner;

public class test16 {

    /*
    //배열 버전
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        test16 T = new test16();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x: T.solution(n)) {
            System.out.print(x + " ");
        }
    }
    */

    //손코딩 버전 (배열 x)
    public void solution(int n){
        int a = 1, b = 1, c;
        System.out.print(a+" "+b+" ");
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        test16 T = new test16();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
