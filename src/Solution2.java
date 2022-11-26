import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Solution2 {
    public boolean solution(int N, int[] A, int[] B) {
        boolean b = true;
        for (int i = 0; i < A.length; i++) {
            if(A[i] + 1 == B[i] || B[i] + 1 == A[i]){
                continue;
            }else{
                b = false;
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            if(!list.contains(A[i])){
                list.add(A[i]);
            }
            if(!list.contains(B[i])){
                list.add(B[i]);
            }
        }

        if(list.size() != N) b = false;

        return b;
    }

}
