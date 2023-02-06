
/*
* 아나그램
* 길이가 같은 두 단어
* 알파벳과 그 개수가 모두 일치
* hashmap
* */

import java.util.HashMap;
import java.util.Scanner;

public class hashMap2 {

    public static void main(String[] args) {
        hashMap2 t = new hashMap2();
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(t.solution(s1,s2));
    }

    public String solution(String s1, String s2 ){
        String answer = "YES";
        HashMap<Character, Integer>map = new HashMap<>();
        for (char x :
                s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
}
