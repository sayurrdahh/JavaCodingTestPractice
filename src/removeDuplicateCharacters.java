/*
* 중복문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
*
* */

import java.util.Scanner;

public class removeDuplicateCharacters {

    public String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        removeDuplicateCharacters T = new removeDuplicateCharacters();
        String str = sc.next();
        System.out.println(T.solution(str));

    }

}
