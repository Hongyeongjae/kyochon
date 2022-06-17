public class level3 {
    
    
    
    
    void rotate() {
        int n = 3; //행의 길이
        int m = 4; //열의 길이
        int num = 1;
        int[][] arr1 = new int[n][m];
            for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
		            arr1[i][j] = num++;
	            }
            }

        int[][] arr2 = new int[m][n]; // 행, 열을 반대로
            for (int i = 0; i < m; i++) { 
	            for (int j = 0; j < n; j++) {
		            arr2[i][j] = arr1[n - 1 - j][i]; // ##핵심 코드##
	            }
            }       
         }
    }
    
