package lecture06;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("小数値を入力してください:");
            Double input = scanner.nextDouble();

            System.out.print("入力した値:" + input);

        }catch(InputMismatchException e){
            System.out.println("エラー");
        }

    }
}
