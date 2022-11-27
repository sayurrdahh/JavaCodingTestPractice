/*
* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 순서대로 자연수를 만들어라
* 아스키 번호 '0' : 48 ~ '9' : 57
* */

import java.util.Scanner;

public class test9 {

    public int solution(String s){
        //int answer = 0;
        String answer = "";
        for(char x : s.toCharArray()){
            //if(x>=48 && x<=57) answer = answer * 10 + (x-48);
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        test9 t = new test9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

}