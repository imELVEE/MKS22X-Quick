public class driver{
  public static void main(String[] args){
    //TESTS PARTITION
    System.out.println("\nTESTING PARTITION");
    System.out.println("The number above the array should be in its index (so 4 should be above modified: _ _ _ _ 4 _)");
    System.out.println("does not work if partition is not public, so either make it public or comment this out");
    System.out.println("-------------------");
    int[] data = new int[] {0,1,4,3,2,5};
    System.out.println(Quick.partition(data,0,5));
    System.out.println("original: 0 1 4 3 2 5");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");

    data = new int[] {5,4,3,2,1,0};
    System.out.println(Quick.partition(data,0,5));
    System.out.println("original: 5 4 3 2 1 0");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");

    data = new int[] {1,4,3,2,5,0};
    System.out.println(Quick.partition(data,0,5));
    System.out.println("original: 1 4 3 2 5 0");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");

    //TESTS QUICKSELECT
    System.out.println("\nTESTING QUICKSELECT");
    System.out.println("-------------------");
    int[] ary = {2, 10, 15, 23, 0, 5};  //sorted :  {0,2,5,10,15,23}
    System.out.println(Quick.quickselect(ary, 0 ));  //would return 0
    System.out.println("^ Should be 0");
    System.out.println(Quick.quickselect(ary, 1 ));  //would return 2
    System.out.println("^ Should be 2");
    System.out.println(Quick.quickselect(ary, 2 ));  //would return 5
    System.out.println("^ Should be 5");
    System.out.println(Quick.quickselect(ary, 3 ));  //would return 10
    System.out.println("^ Should be 10");
    System.out.println(Quick.quickselect(ary, 4 ));  //would return 15
    System.out.println("^ Should be 15");
    System.out.println(Quick.quickselect(ary, 5 ));  //would return 23
    System.out.println("^ Should be 23");
  }
}
