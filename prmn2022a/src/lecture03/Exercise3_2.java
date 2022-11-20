package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.println("何行分入力しますか？");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "行目:");
            String b = scanner.nextLine();
            list.add(b);
        }
        System.out.println("入力した文字列:");

        int i = 0;

        for(String string : list){
            System.out.println("[" + i + "]" + string);
            i = i + 1;
        }

    }
}