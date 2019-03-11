public class driver{
  public static void main(String[] args){
    int[] data = new int[] {0,1,4,3,2,5};
    System.out.println(Quick.partition(data,0,5));
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");

    data = new int[] {5,4,3,2,1,0};
    System.out.println(Quick.partition(data,0,5));
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");

    data = new int[] {1,4,3,2,5,0};
    System.out.println(Quick.partition(data,0,5));
    for(int i = 0 ; i < data.length ; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("\n");
  }
}
