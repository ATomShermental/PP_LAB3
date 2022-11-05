package lab3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
     //   Set<Character> set = new SortedSet<>();
        SortedSet<Character> set2 = new TreeSet<>();
        while(true){
            String current = scanner.nextLine();
            if(current.equals(""))
                break;
            sb.append(current);
        }
        for(int i =0; i< sb.length();i++){
            set2.add(sb.charAt(i));
        }
        set2.remove(',');
        set2.remove('.');
        for(var x : set2){
            System.out.print(x + " ");
        }
        }
}
