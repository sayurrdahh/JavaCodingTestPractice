/*
* 가장 짧은 문자거리
* 1.왼쪽으로 쭉 탐색
* 2.오른쪽으로 쭉 탐색 (작은 값 넣어주기)
* */

import java.util.Scanner;

public class shortestDistance {

    public int[] solution(String s, char tn){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == tn){
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == tn){
                p=0;
            } else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        shortestDistance t = new shortestDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x : t.solution(str, c)){
            System.out.print(x + " ");
        }

    }
}
