package lecture05;

public class Exercise5_7 {

    public static void main(String[] args) {
        Insect insect = new Insect();
        Butterfly butterfly = new Butterfly();
        Locust locust  = new Locust();
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();

        Insect[] list = new Insect[4];

        list[0] = insect;
        list[1] = butterfly;
        list[2] = locust;
        list[3] = swallowtailButterfly;

        for (Insect insect1 : list){
            insect1.move();
        }

    }
}
