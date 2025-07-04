public class javaValiable {

  public static void main(String[] args){

    int age = 28;
    System.out.println("あなたの年齢は" + age + "です。");

    // 定数 finalと修飾子をつけて、さらにすべて大文字
    final int FULL_SCORE = 100;

    int score = 76;

    System.out.println("残り" + (FULL_SCORE - score) + "点です。");

  }
  
}
