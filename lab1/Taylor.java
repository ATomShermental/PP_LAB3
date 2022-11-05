package lab1;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class Taylor {

    public static double getFactorial(int f) {
        double result = 1d;
        for (int i = 1; i <= f; i++)
            result = result*i;
        return result;
    }

        public void taylorFormula(double x, int k){
            double epsilon = Math.pow(10,-k);
            double sum = 1;
            double pow = 1;
            double n = 1;
            while(true){
                double nextTerm = Math.pow(x,pow)/getFactorial((int)pow);
                if(Math.abs(nextTerm) < epsilon){
                    break;
                }
                sum = sum +nextTerm;
                pow++;

            }
            BigDecimal scaledSum= new BigDecimal(Double.toString(sum));
            scaledSum = scaledSum.setScale(3, RoundingMode.HALF_UP);
            System.out.println("My exp is: " + scaledSum);
            double exp = Math.exp(x);
            BigDecimal scaledExp = new BigDecimal(Double.toString(exp));
            scaledExp = scaledExp.setScale(3, RoundingMode.HALF_UP);
            System.out.println("Standart function exp is: " + scaledExp);
        }
}
