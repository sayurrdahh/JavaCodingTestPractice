package pnp;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


class Point{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class maze {

    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] dis;
    static char[][] board;

    public void BFS(int x, int y){
        Queue<Point> Q=new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y]='S';
        while(!Q.isEmpty()){
            Point tmp=Q.poll();
            for(int i=0; i<4; i++){
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if(nx>=1 && nx<=64 && ny>=1 && ny<=64 && board[nx][ny] != '#'){
                    board[nx][ny]='*';
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static String readFile(String path, Charset encoding) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main(String[] args) throws IOException {

        String filepath = "/Users/daheeyoon/Desktop/study/CodingTest/src/pnp/file/maze2.txt";
        //파일 객체 생성
        Path path = Paths.get(filepath);
        // 캐릭터셋 지정
        Charset cs = StandardCharsets.UTF_8;

        int lineCount = 0;
        // 파일 라인수 세기
        try {
            lineCount = (int) Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //파일 전체 읽어서 저장
        String content = "";
        try {
            content = readFile(filepath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] chars = content.toCharArray();

        maze T = new maze();
        board=new char[lineCount + 1][lineCount + 1];
        dis=new int[lineCount + 1][lineCount + 1];

        int k = 0;
        for(int i=1; i<=lineCount; i++){
           // String line = st.nextToken();
            for(int j=1; j<=lineCount; j++){
                board[i][j] = chars[k];
                k++;
            }
        }

        T.BFS(1, 2);

        System.out.println(dis[lineCount][lineCount]);
        if(dis[lineCount][lineCount - 1]==0) System.out.println(-1);
        else System.out.println(dis[lineCount][lineCount]);
    }
}
