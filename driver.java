public class driver{
  public static void main(String[] args){
    //TESTS PARTITION
    System.out.println("\nTESTING PARTITION");
    System.out.println("The number above the array should be in its index (so 4 should be above modified: _ _ _ _ 4 _)");
    System.out.println("does not work if partition is not public, so either make it public or comment this out");
    System.out.println("-------------------");
    int[] sortedData = new int[] {0,1,2,3,4,5};
    int[] data = new int[] {0,1,4,3,2,5};
    //test speed/stack overflow
    for (int i = 0 ; i < 1000 ; i++){
      int part = Quick.partition(data,0,5);
      if (part != sortedData[part]){
        System.out.println("\nOops! your partition returned "+part+" when it should've been "+sortedData[part]);
      }
      data = new int[] {0,1,4,3,2,5};
    }
    int part = Quick.partition(data,0,5);
    System.out.println(part);
    System.out.println("original: 0 1 4 3 2 5");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    if (part == sortedData[part]){
      System.out.println("\nYay, your partition works!");
    }
    else{
      System.out.println("\nOops! your partition returned "+part+" when it should've been "+sortedData[part]);
    }
    System.out.println();

    data = new int[] {5,4,3,2,1,0};
    //test speed/stack overflow
    for (int i = 0 ; i < 1000 ; i++){
      part = Quick.partition(data,0,5);
      if (part != sortedData[part]){
        System.out.println("\nOops! your partition returned "+part+" when it should've been "+sortedData[part]);
      }
      data = new int[] {5,4,3,2,1,0};
    }
    //test once
    part = Quick.partition(data,0,5);
    System.out.println(part);
    System.out.println("original: 5 4 3 2 1 0");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    if (part == sortedData[part]){
      System.out.println("\nYay, your partition works!");
    }
    else{
      System.out.println("\nOops! your partition returned "+part+" when it should've been "+sortedData[part]);
    }
    System.out.println();

    data = new int[] {1,4,3,2,5,0};
    //test speed/stack overflow
    for (int i = 0 ; i < 1000 ; i++){
      part = Quick.partition(data,0,5);
      if (part != sortedData[part]){
        System.out.println("\nOops! your partition returned "+part+" when it should've been "+sortedData[part]);
      }
      data = new int[] {1,4,3,2,5,0};
    }
    part = Quick.partition(data,0,5);
    System.out.println(part);
    System.out.println("original: 1 4 3 2 5 0");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    if (part == sortedData[part]){
      System.out.println("\nYay, your partition works!");
    }
    else{
      System.out.println("\nOops! your partition returned "+part+" when it should've been "+sortedData[part]);
    }
    System.out.println();

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
    System.out.println();

    System.out.println("with duplicates");
    System.out.println("-------------------");
    sortedData = new int[] {0,1,2,2,3,4,5,5,6,6,7,8,8,9};
    data = new int[] {1,6,3,5,8,7,6,9,0,2,4,8,2,5}; // sorted: {0,1,2,2,3,4,5,5,6,6,7,8,8,9}
    part = Quick.quickselect(data,9);
    System.out.println(part);
    System.out.println("original: 1  6  3  5  8  7  6  9  0  2  4  8  2  5");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + "  ");
    }
    System.out.println("\nindex:    0  1  2  3  4  5  6  7  8  9  10 11 12 13");
    if (part == sortedData[9]){
      System.out.println("Yay, your quickselect works with duplicates!");
    }
    else{
      System.out.println("Oops! your quickselect returned "+part+" when it should've been "+sortedData[9]+"  "+(part == sortedData[9]));
    }
    System.out.println();

    sortedData = new int[] {0,1,2,2,3,4,5,5,6,6,7,8,8,9};
    data = new int[] {1,6,3,5,8,7,6,9,0,2,4,8,2,5}; // sorted: {0,1,2,2,3,4,5,5,6,6,7,8,8,9}
    part = Quick.quickselect(data,4);
    System.out.println(part);
    System.out.println("original: 1  6  3  5  8  7  6  9  0  2  4  8  2  5");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + "  ");
    }
    System.out.println("\nindex:    0  1  2  3  4  5  6  7  8  9  10 11 12 13");
    if (part == sortedData[4]){
      System.out.println("Yay, your quickselect works with duplicates!");
    }
    else{
      System.out.println("Oops! your quickselect returned "+part+" when it should've been "+sortedData[4]+"  "+(part == sortedData[4]));
    }
    System.out.println();

    sortedData = new int[] {0,1,2,2,3,4,5,5,6,6,7,8,8,9};
    data = new int[] {1,6,3,5,8,7,6,9,0,2,4,8,2,5}; // sorted: {0,1,2,2,3,4,5,5,6,6,7,8,8,9}
    part = Quick.quickselect(data,7);
    System.out.println(part);
    System.out.println("original: 1  6  3  5  8  7  6  9  0  2  4  8  2  5");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + "  ");
    }
    System.out.println("\nindex:    0  1  2  3  4  5  6  7  8  9  10 11 12 13");
    if (part == sortedData[7]){
      System.out.println("Yay, your quickselect works with duplicates!");
    }
    else{
      System.out.println("Oops! your quickselect returned "+part+" when it should've been "+sortedData[7]+"  "+(part == sortedData[6]));
    }
    System.out.println();

    sortedData = new int[] {0,1,2,2,3,4,5,5,6,6,7,8,8,9};
    data = new int[] {1,6,3,5,8,7,6,9,0,2,4,8,2,5}; // sorted: {0,1,2,2,3,4,5,5,6,6,7,8,8,9}
    part = Quick.quickselect(data,12);
    System.out.println(part);
    System.out.println("original: 1  6  3  5  8  7  6  9  0  2  4  8  2  5");
    System.out.print("modified: ");
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + "  ");
    }
    System.out.println("\nindex:    0  1  2  3  4  5  6  7  8  9  10 11 12 13");
    if (part == sortedData[12]){
      System.out.println("Yay, your quickselect works with duplicates!");
    }
    else{
      System.out.println("Oops! your quickselect returned "+part+" when it should've been "+sortedData[12]+"  "+(part == sortedData[11]));
    }
    System.out.println();
  }
}
