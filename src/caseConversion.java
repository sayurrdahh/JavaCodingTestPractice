import java.util.Scanner;

//2.대소문자 변환
public class caseConversion {

    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            // if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            // else answer += Character.toLowerCase(x);
            if(x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args){
        caseConversion T = new caseConversion();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
