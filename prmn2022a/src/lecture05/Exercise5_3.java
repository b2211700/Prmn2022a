package lecture05;

public class Exercise5_3 {

    public static void main(String[] args) {

        Butterfly butterfly = new Butterfly("飛んだよ");
        Insect butterfly1 = butterfly;

        butterfly1.move();
    }
}
