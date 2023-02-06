/*
* 어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고
* 작거나 같으면 보이지 않는다.
* */

import java.util.Scanner;

public class heightOrder {

    public int Solution(int n, int[] arr){
        int answer = 1, max = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        heightOrder T = new heightOrder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n,arr));

    }

}
