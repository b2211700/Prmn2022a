package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(210,100, "fighter1");
        Fighter f2 = new Fighter(180, 150, "fighter2");

        while(true){
            f1.attack(f2);
            System.out.println(f2.getName() + "の残りHP:" + f2.getHitPoint());

            if (f2.isAlive()){
                System.out.println(f2.getName() + "は倒れた。");
                break;
            }

            f2.attack(f1);
            System.out.println(f1.getName() + "の残りHP:" + f1.getHitPoint());

            if(f1.isAlive()){
                System.out.println(f1.getName() + "は倒れた。");
                break;
            }

        }
    }
}
