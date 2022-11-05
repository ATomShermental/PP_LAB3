import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix dimension n");
        int n = scanner.nextInt();
        System.out.println("Enter matrix dimension m");

        int m = scanner.nextInt();
        System.out.println("Enter lowerBound of random");
        int lowerBound = scanner.nextInt();
        System.out.println("Enter upperBound of random");
        int upperBound = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j<m ; j++){
                matrix[i][j] = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

       Vector<Integer> vector = new Vector<>(n*m);

        for(int i =0; i< n; i++){
            for(int j = 0; j < m; j++){
                vector.add(matrix[i][j]);
            }}


            Collections.sort(vector);
           // System.out.println(vector);



        if(vector.size() < 2) {
            System.out.println(vector.get(0));
            return;
        }
        if(vector.get(0) != vector.get(1)){
            System.out.println(vector.get(0));
            return;
        }
       for(int i = 1; i < vector.size()-1;i++){
           if(vector.get(i) != vector.get(i-1) && vector.get(i) != vector.get(i+1)){
               System.out.println(vector.get(i));
               return;
           }
       }
       if(vector.get(vector.size()-1) != vector.get(vector.size()-2)){
           System.out.println(vector.get(vector.size()-1));
           return;
       }
        System.out.println("No such element");


    }
}