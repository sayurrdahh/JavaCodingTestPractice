import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//hash map, sliding window
//매출액의 종류

public class test34 {

    public static void main(String[] args) {

        test34 t = new test34();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x :
                t.solution(n, k, arr)) {
            System.out.print(x+" ");
        }
    }

    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        //초기값 세팅, k전까지
        for(int i=0; i<k-1 ; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt],0)+1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt])-1);
            if (hm.get(arr[lt])==0) hm.remove(arr[lt]);
            lt++;
        }
        return answer;
    }



}
