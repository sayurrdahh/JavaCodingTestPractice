/*
경로 탐색 (인접리스트)
방향그래프가 주어지면 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수를
출력하는 프로그램을 작성하세요.
정점의 개수가 많으면 arraylist를 쓴다
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v){
        if(v==n) answer++;
        else{
            for (int nv :
                    graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyList T = new AdjacencyList();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

}
