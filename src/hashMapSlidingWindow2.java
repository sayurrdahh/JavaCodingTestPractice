/*
* 모든 아나그램 찾기
* 해쉬, 슬라이딩 윈도우 : 시간복잡도 o(n)
*
* */

import java.util.HashMap;
import java.util.Scanner;

public class hashMapSlidingWindow2 {

    public static void main(String[] args) {
        hashMapSlidingWindow2 hashMapSlidingWindow2 = new hashMapSlidingWindow2();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(hashMapSlidingWindow2.solution(s,t));
    }

    public int solution(String s, String t){
        int answer = 0;

        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();

        for (char x :
                t.toCharArray()) {
            tm.put(x, tm.getOrDefault(x, tm.getOrDefault(x,0)+1));
        }

        //미리 세팅
        int len = t.length()-1;
        for (int i = 0; i < len; i++) {
            sm.put(s.charAt(i),sm.getOrDefault(s.charAt(i),0)+1);
        }

        int lt = 0;
        for(int rt = len; rt < s.length(); rt++) {
           sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt),0)+1);
           if(sm.equals(tm)) answer++;
           sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1);
           if(sm.get(s.charAt(lt)) == 0) sm.remove(s.charAt(lt));
           lt++;
        }

        return answer;
    }
}
