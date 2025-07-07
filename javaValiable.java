class javaValiable {

  public static void main(String[] args){

    int age = 28;
    float value = 58.3F;
    long takerCnt = 12345L;
    

    // 定数 finalと修飾子をつけて、さらにすべて大文字
    final int FULL_SCORE = 100;

    int score = 76;
    char level = 'B'; //char型は、シングルクォーテーション
    String name = "山田太郎"; //String型は、ダブルクォテーション

    System.out.println(name + "さん");
    System.out.println("年齢" + age + "です。");
    System.out.println("偏差値：" + value);
    System.out.println("残り" + (FULL_SCORE - score) + "点です。");
    System.out.println("偏差値：" + value);
    System.out.println("受験者数：" + takerCnt);
    System.out.println("判定：" + level);




  }
  
}
