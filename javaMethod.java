public class javaMethod {

  public static void main (String[] args){

    // メソッド呼び出し
    int valueSquared = square(3);

    System.out.println("3の2乗は" + valueSquared);


    double result = getCircleArea(2.0);
    System.out.println("円の面積：" + result);


    //-----------自己紹介文出力-----------------
    String introString = createIntro("山田太郎", 35, "株式会社テスト");
    System.out.println(introString);

    //-----------自己紹介文出力　戻り値なしバージョン-------------
    displayIntro("鈴木次郎", 28, "株式会社〇〇");
    // 戻り値がないため、変数に格納はできない
    // String result = displayIntro("鈴木次郎", 28, "株式会社〇〇");


    //-----------入力された数値の合計値を出力する-----------------
    int number1 = inputInt();
    int number2 = inputInt();
    displayAddResult(number1, number2);
  }


  // 引数の値を2乗するメソッド
  static int square(int value){
    int result = value * value;
    return result;
  }

  // 円の面積をを計算して返す
  static double getCircleArea(double radius){
    double result = radius * radius * 3.14;
    return result;
  }

  static String createIntro(String name, int age, String company){
    String intro = getDelimiter();
    intro += name + "(" + age + ")\n";
    intro += company + "\n";
    intro += getDelimiter();
    return intro;
  }
  

  static String getDelimiter(){
    return "------------------\n";
  }

  //戻り値のないメソッド. void 戻り値がない型
  static void displayIntro(String name, int age, String company){
    displayDelimiter();
    System.out.println(name + "(" + age + ")");
    System.out.println(company);
    displayDelimiter();
  }

  static void displayDelimiter(){
    System.out.println("++++++++++++++++++");
    // 戻り値がないため、returnも省略できる
    // return;
  }


  //2つの数値と合計を表示するメソッド
  static void displayAddResult(int value1, int value2){
    displayDelimiter();
    System.out.println("数値1:"+ value1);
    System.out.println("数値2:"+ value2);
    displayDelimiter();
    System.out.println("合計値:" + (value1 + value2));
  }

  // 入力された数値を返すメソッド
  static int inputInt(){
    System.out.println("整数を入力してください。");
    String value = new java.util.Scanner(System.in).nextLine();
    int number = Integer.parseInt(value);
    return number;
  }

}
