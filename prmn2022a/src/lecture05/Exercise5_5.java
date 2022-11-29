package lecture05;

public class Exercise5_5 {

    public static void main(String[] args) {

        Locust locust = new Locust("跳んだよ");
        Insect locust1 = locust;

        locust1.move();

    }
}
