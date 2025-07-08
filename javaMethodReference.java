public class javaMethodReference {

  public static void main(String[] args){

    int a = 5;
    System.out.println(a);
    // 基本データ型で値渡しで渡される場合、aには上書きされない。
    displayPlusOne(a);
    //なので、大本のaの内容は上書きされない
    System.out.println("a" + a);


    //参照型を引数として渡す場合は、参照型の場合は上書きされてしまう。
    int[] arrayMain = {10,3,6};
    for(int i = 0; i < arrayMain.length; i++){
      System.out.print(arrayMain[i] + " ");
    }
    System.out.println("arrayMain in main");
    
    displayArrayPlusOne(arrayMain);

    for(int i = 0; i < arrayMain.length; i++){
      System.out.print(arrayMain[i] + " ");
    }
    System.out.println("arrayMain in main");


    //---------参照型の上書きの性質を利用したソース-------
    int[] array = {-2, 2, 4, 5};
    // ここでarrayの内容を上書き
    absArray(array);
    System.out.println("上書き後のarray");
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }

    
  }

  static void displayPlusOne(int val){
    System.out.println(++val + "(val) in displayPlusOne");
  }

  static void displayArrayPlusOne(int[] array){
    for(int i = 0; i < array.length; i++){
      System.out.print(++array[i] + " ");
    }
    System.out.println("array[] displayArrayPlusOne");
  }

  //マイナスの値をプラスに変換するメソッド
  static void absArray(int[] intArray){
    for(int i = 0; i < intArray.length; i++ ){
      if(intArray[i] < 0){
        intArray[i] *= -1;
      }
    }
  }

}
