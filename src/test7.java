/* 앞뒤로 읽어도 똑같은 문자 비교 */

import java.util.Scanner;

public class test7 {

    public String solution(String str){
        String answer = "YES";

       /*

       str = str.toUpperCase();
        int len = str.length();
        for(int i=0;i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }

        */
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";

        return answer;

    }

    public static void main(String[] args){
        test7 t = new test7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
