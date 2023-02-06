import java.util.Scanner;
/*
* 점수계산
* 1이 연속이면 누적점수
*
* */
public class score {

    public int solution(int n, int[] arr){
        int answer=0, cnt=0; //cnt는 누적점수
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        score T = new score();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
