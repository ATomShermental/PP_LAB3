package lab1;


import java.util.Scanner;

//variant 1
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int k = scanner.nextInt();
        Taylor taylor = new Taylor();
        taylor.taylorFormula(x,k);
        System.out.println();

    }
}
