import java.util.Arrays;
import java.util.Scanner;
//sort
public class checkDuplication {

    public static void main(String[] args) {
        checkDuplication t = new checkDuplication();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,arr));
    }

    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr); //오름차순 정렬
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]) return "D";
        }
        return answer;
    }
}
