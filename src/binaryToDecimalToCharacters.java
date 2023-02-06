/*
* #은 이진수의 1로 *은 0으로 변환
*  바꾼 이진수를 십진수화 한다
* 십진수한 숫자를 알파벳화 한다
* */

import java.util.Scanner;

public class binaryToDecimalToCharacters {

    public String solution(int n, String s){
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2); //십진수화
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args){
        binaryToDecimalToCharacters t = new binaryToDecimalToCharacters();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(t.solution(n,str));
    }

}
