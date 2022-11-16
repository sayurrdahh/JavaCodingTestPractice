import java.util.Scanner;

//3. 문장 속 단어(indexOf(), substring())
public class test3 {

    //인스턴스 메소드
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        /*
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }
         */

        while((pos=str.indexOf(" ")) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        test3 T = new test3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
