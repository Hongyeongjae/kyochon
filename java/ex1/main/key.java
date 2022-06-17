import java.util.Arrays;
    public class key {
        public static void main(String[] arg){
         int key[][] = {{0,0,0,},{1,0,0},{0,1,1}};
         // int lock [][] = {{1,1,1},{1,1,0},{1,0,1}}; 
         System.out.println(solution (key));
         solution((key));
        }
         public static int[][] solution(int[][] key) {
         int m = key[0].length;
        int n = key.length;
        
        int[][] arr1 = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[j][n-1-i] = key[i][j];
                System.out.println(Arrays.deepToString(arr1));
            }
        }}
        return arr1;
    }
  for ( int i; i<lock.length; i++) {
    for ( int j; j<lock(i); j++) {
        if(lock.get[(i)(j)] == 0) {
            for(int a=)
        }
    }
  }

public static int[][] solution((key)) {
    for (int i; i<lock.length; i++) {
        for (int j; j<lock(i); j++) {
            if(lock.get[(i)(j)] == 0) {
                for (int a; a<key.length; a++) {
                    for ( int b; b<key(a); b++) {
                        if(key.get[(a)(b)] == 1) {
                            answer = true;
                        }
                    }
                }
            }
        }
    }
}

    

