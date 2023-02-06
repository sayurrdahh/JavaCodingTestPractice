/*
* 알파벳 이외의 문자는 무시하고 회문 검사
* */

import java.util.Scanner;

public class palindrome2 {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;


    }

    public static void main(String[] args){
        palindrome2 t = new palindrome2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(t.solution(str));
    }

}
