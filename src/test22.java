import java.util.Scanner;

/*
* n * n 격자판이 주어지면
* 자신의 상하좌우보다 큰 숫자는 봉우리
* 봉우리가 몇개인가
* */
public class test22 {

    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};

    public int solution(int n, int[][] arr){
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k = 0 ; k < 4 ; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < n && ny >=0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        test22 T = new test22();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
