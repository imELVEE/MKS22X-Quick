public class Quick{
  public static int quickselect(int[] data, int k){
    /*
    while (partition(data,0,data.length-1) != k){
    }
    return data[k];
    */
    return quicksel(data,k,0,data.length-1);
  }

  private static int quicksel(int[] data, int k, int start, int end){
    int pivot = partition(data,start,end);
    if (pivot < k){
      return quicksel(data,k,pivot+1,end);
    }
    else if (pivot > k){
      return quicksel(data,k,start,pivot-1);
    }
    return data[k];
  }

  public static int partition(int[] data, int start, int end){
    int randIndex = (int) (Math.random()*10%(end-start)) + start;
    int pivot = data[randIndex];

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
