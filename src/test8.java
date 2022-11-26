/*
* 알파벳 이외의 문자는 무시하고 회문 검사
* */

import java.util.Scanner;

public class test8 {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;


    }

    public static void main(String[] args){
        test8 t = new test8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(t.solution(str));
    }

}
