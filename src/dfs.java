/*
* 경로 탐색(인접행렬)
* 방향그래프
* 1번에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하라
*
* */

import java.util.Scanner;

public class dfs {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n) answer++;
        else{
            for (int i = 1; i <= n ; i++) {
                if(graph[v][i] == 1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs T = new dfs();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

}
