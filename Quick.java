public class Quick{
  private static int dupli = 0;

  public static void quicksort(int[] data){
    quick(data,0,data.length-1);
  }

  private static void quick(int[] data, int lo, int high){
    /*
    int pivot = partition(data,lo,high);
    if (pivot != high){
      if (pivot < high-1){
        quick(data,pivot+1,high);
      }
      if (pivot > lo){
        quick(data,lo,pivot-1);
      }
    }
    */
    //System.out.println("lo: " + lo + "\nhigh: " + high + "\ndifference: " + (high-lo) + "\nmiddle: " + ((high-lo)/2 + lo) + "\n");
    int middle = (high-lo)/2 + lo;
    quicksel(data,middle,lo,high);
    if (lo != high && middle != 0){
      quick(data,middle+1,high);
      quick(data,lo,middle-1);
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

//pivot here is the index, like k
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

//pivot here is the value
  public static int partition(int[] data, int start, int end){
    int randIndex = (int) (Math.random()*(end-start+1)) + start;
    //System.out.println("Random Index: " + randIndex);
    int pivot = data[randIndex];
    //System.out.println("data[random]: " + pivot + "\n");

/*
    data[randIndex] = data[start];
    data[start] = pivot;
    */

    swap(data,randIndex,start);
    start++;

    for (int i = start ; i < end+1 ;){
      if(data[i] < pivot){
        i++;
      }
      else if(data[i] == pivot){
        if (Math.random() < 0.5){
          i++;
        }
        else{
          swap(data,i,start);
          start++;
          end--;
          dupli++;
        }
      }
      else{
        /*
        int tobeSwapped = data[i];
        data[i] = data[end];
        data[end] = tobeSwapped;
        */
        swap(data,i,end);
        end--;
      }
    }


    data[start-1] = data[end];
    data[end] = pivot;
    return end;
  }

  private static void swap(int[] data, int first, int second){
    int tobeSwapped = data[first];
    data[first] = data[second];
    data[second] = tobeSwapped;
  }
}
