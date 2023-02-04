import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
* k번째 큰 수
* treeSet
* n장의 카드 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록
* 3장을 뽑을 수 있는 모든 경우를 기록
* 기록한 값 중 k번째로 큰 수 출력
* 없으면 -1
* */

public class test36 {

    //shift command v : 클립보드에서 복사
    public static void main(String[] args) {
        test36 t = new test36();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x :
                tset) {
            cnt++;
            if(cnt == k) return x;
        }

        return answer;
    }
}
