public class javaArray {

  public static void main(String[] args) {

    String[] item = { "ボールペン", "ノート", "付箋紙" };
    int[] price = { 75, 80, 85 };

    System.out.println(item[0] + ":" + price[0] + "円");
    System.out.println(item[1] + ":" + price[1] + "円");
    System.out.println(item[2] + ":" + price[2] + "円");

    System.out.println("商品数" + item.length);


    //----------------- 多次元配列----------------
    String[] subjects = { "国語", "算数", "英語", "理科" };
    String[] persons = { "山田", "鈴木", "田中" };
    int[][] score = {
        { 83, 95, 100 },
        { 84, 90, 95, 60 },
        { 80, 70, 60 },
    };

    int total;

    for (int i = 0; i < score.length; i++) {
      total = 0;
      System.out.println("\n--" + persons[i] + "さんの得点--");
      for (int j = 0; j < score[i].length; j++) {
        System.out.println(subjects[j] + ":" + score[i][j]);
        total += score[i][j];
      }

      System.out.println("\n合計:" + total); 
      System.out.println("平均:" + total / score[i].length); 

    }

  }

}
