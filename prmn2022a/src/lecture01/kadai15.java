package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};

        String seiseki;
        for(int i = 0; i < score.length; i++ ){
            if(score[i] < 60){
                seiseki = "不可";
            }else if(score[i] < 70){
                seiseki = "可";
            }else if(score[i] < 80){
                seiseki = "良";
            }else if(score[i] < 90){
                seiseki = "優";
            }else if(score[i] <= 100){
                seiseki = "秀";
            }else{
                seiseki = "error";
            }
            System.out.println(i + "番" + score[i] + "点" + seiseki);

        }
        System.out.println("・・・・・・・・・・・・・");
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最抵点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");
        System.out.println("・・・・・・・・・・・・・");
    }
    //最小値
    static int min(int[] score){
        int intMin = score[0];

        for(int i = 0; i<score.length; i++){
            if(intMin>score[i]){
                intMin = score[i];
            }
        }
        return intMin;
    }
    //最大値
    static int max(int[] score){
        int intMax = score[0];

        for(int i = 0; i<score.length; i++){
            if(intMax<score[i]){
                intMax = score[i];
            }
        }
        return intMax;
    }
    //平均
    static double average(int[] score){
        int sum = 0;
        double ave = 0;

        for(int i = 0; i < score.length; i++){
            sum = sum + score[i];
        }
            ave = (double)sum / (double)score.length;
        return ave;
    }
}
