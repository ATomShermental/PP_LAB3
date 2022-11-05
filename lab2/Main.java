package lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int m = scanner.nextInt();
	    int[][] matrix = new int[n][m];
	    for(int i = 0; i < n; i++){
			System.out.println("");
			for (int j = 0; j<m ; j++){
	            matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j]+ " ");
            }
        }

			int result = matrix[0][0];
	    	boolean isSingle = true;
	    	int lastBanned;
			int counter = 0;

				for (int i = 0; i < n ; i++) {

					for (int j = 0; j < m; j++) {


						if (matrix[i][j] < result) {
							result = matrix[i][j];
							isSingle = false;
						}


					}
				}



		System.out.println("\n"+result);
    }
}
