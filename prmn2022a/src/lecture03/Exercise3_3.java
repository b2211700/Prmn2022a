package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sentence = new ArrayList<>(2);


        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "つ目の整数を入力してください:");
            String b = scanner.nextLine();
            sentence.add(b);
            //int num = Integer.persenInt(b);
        }

    }
}