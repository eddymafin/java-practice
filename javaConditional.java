public class javaConditional {

  public static void main(String[] args) {
    System.out.println("\n12歳以上=1, 6歳以上12歳未満=2 , 6再未満 =3");
    String str = new java.util.Scanner(System.in).nextLine();
    int value = Integer.parseInt(str);

    //結果となる式に限定される。複雑な分岐はif分がよい。
    switch (value) {
      case 1:
        System.out.println("\n2000円");
        break;
      case 2:
        System.out.println("\n1000円");
        break;
      case 3:
        System.out.println("\n0円");
        break;
      default:
        System.out.println("指定された区分が間違っています");

    }

  }

}
