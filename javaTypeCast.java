class javaTypeCast {
  public static void main(String[] args){

    int a = 10;
    double b = a; //自動的な型変換、ここではdouble型に変換される

    System.out.println("b:" + b);

    // 演算時の自動的な型変換(評価ごとに型がきまる)
    double c = 3/2 * 2.0;
    System.out.println("c:" + c);

    // 演算時の自動的な型変換(String型の連結)
    int e = 50;
    int f =20;
    String g = e + f + "円が合計です";
    System.out.println("g:" + g);

    //こちらは、左から、文字列となって連結されるため、eとfはString形に変換される
    String h = "合計は" + e + f + "円です";

    System.out.println("h:" + h);

    //下記は、カッコが優先されるため、算術演算されてから、文字列連結される
    String i = "合計は" + (e + f) + "円です";
    System.out.println("i:" + i);



// =============キャスト================
final double TAX_RATE = 1.08;
int price = 20;

// (int)でint型に型キャスト。
int result = (int)(price * TAX_RATE);

//下記は、エラー。(int) priceでpriceがint型になるが、* TAX_RATEにより、double型になる。
// int型の変数には、double型のほうが大きいため、自動型変換できないため、コンパイルエラーになる。
// int result2 = (int) price * TAX_RATE;
System.out.println("result:" + result);






  }
}
