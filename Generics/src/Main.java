import services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> teste = new ArrayList<>();

        PrintService<Integer> ps = new PrintService<>();
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            int number = sc.nextInt();
            ps.addValue(number);
        }

        ps.print();


        sc.close();



    }
}