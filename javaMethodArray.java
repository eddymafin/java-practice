public class javaMethodArray {

  public static void main(String[] args){

    //double型　配列の宣言、初期化
    double[] arrayDouble = {3.3, 11.3, 15.8};

    //int型配列の取得
    int[] arratInt = getIntArray(arrayDouble);
    for(int i = 0; i < arratInt.length; i++){
      System.out.println(arratInt[i]);
    }

    int[] array = {3,5,8};
    System.out.println("合計値:" + total(array));
  }
  

  // double配列をint配列に変換
  static int[] getIntArray(double[] arrayDouble){
    //結果配列の宣言、要素の領域確保。なぜここで、newとするのかがわからない。
    int result[] = new int[arrayDouble.length];

    for(int i =0; i < arrayDouble.length; i++){
      System.out.println(arrayDouble[i]);
      result[i] = (int)arrayDouble[i];
    System.out.println("result[i]" + result[i]);
    }
    return result;
  }


  //配列の合計値を出力するメソッド
  static int total(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return sum;
  }
}
