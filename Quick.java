public class Quick{
  public static int partition(int[] data, int start, int end){
    int randIndex = (int) (Math.random()*10%(end-start)) + start;
    int pivot = data[randIndex];
    System.out.println(pivot);

    data[randIndex] = data[start];
    data[start] = pivot;
    start++;

    for (int i = start ; i < end+1 ;){
      if(data[i] < pivot){
        i++;
      }
      else{
        int tobeSwapped = data[i];
        data[i] = data[end];
        data[end] = tobeSwapped;
        end--;
      }
    }

    data[start-1] = data[end];
    data[end] = pivot;
    return end;
  }
}
