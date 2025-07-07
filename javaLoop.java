public class javaLoop {

  public static void main (String[] args){

    // int total = 0;

    // for(int i =0; i < 10; i++){

    //   total += i;
    // }

    // System.out.println("合計" + total);


    String[] subjects = {"国語", "算数", "英語"};
    int[] score = {83, 95, 100};
    int total = 0;

    for(int i = 0; i < subjects.length; i++){
      System.out.println(subjects[i] + score[i]);
      total += score[i];
    }

    System.out.println("合計" + total);
    System.out.println("平均" + total / subjects.length);

  }
  
}
