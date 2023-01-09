/*
* 큰 수 출력하기
* n개의 정수를 입력받아 자신의 바로 앞 수보다 큰 수만 출력*
* */

import java.util.ArrayList;
import java.util.Scanner;

public class test13 {

    public ArrayList<Integer> solution(int n, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1 ; i < n; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;

    }

    public static void main(String[] args){

        test13 T = new test13();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }

}
