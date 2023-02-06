import java.util.Scanner;

/*
* 압축된 문자열 출력
* */
public class compressWords {

    public String solution(String s){
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length()-1; i++) {
           if(s.charAt(i) == s.charAt(i+1)) cnt++;
           else {
               answer += s.charAt(i);
               if(cnt > 1) answer += String.valueOf(cnt);
               cnt = 1;
           }
        }

        return answer;
    }

    public static void main(String[] args) {
        compressWords t = new compressWords();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }

}
