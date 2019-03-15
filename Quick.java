public class Quick{
  public static void quicksort(int[] data){
    quick(data,0,data.length-1);
  }

  private static void quick(int[] data, int lo, int high){
    int pivot = partition(data,lo,high);
    if (pivot != high){
      if (pivot < high-1){
        quick(data,pivot+1,high);
      }
      if (pivot > lo){
        quick(data,lo,pivot-1);
      }
    }
  }


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
    while (pivot != k){
      if (pivot < k){
        pivot = partition(data,pivot+1,end);
      }
      else if (pivot > k){
        pivot = partition(data,start,pivot-1);
      }
    }
    return data[k];
  }

  public static int partition(int[] data, int start, int end){
    int tens = 1;
    for (int length = data.length ; length > 0 ; length /= 10){
      tens *= 10;
    }
    int randIndex = (int) (Math.random()*tens%(end-start)) + start;
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
