package lecture06;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {

    public static void main(String[] args) {
        Random random = new Random();
        //System.out.println(random.nextInt(100));

        System.out.println("サイコロを5つ振りました。");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            integers.add(random.nextInt(6) + 1);
        }

        try{
            System.out.println("何番目のサイコロの値を確認しますか？");
            int input = scanner.nextInt();
            System.out.println(integers.get(input));

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外にアクセスしました。");
            System.out.println("プログラムを終了します。");
        }
        catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
