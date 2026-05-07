public class Main {

  public static void main(String[] args) {

    int[] arr = {900,1200,1200,1200,1500};

    System.out.println(serch(arr,1200));

  }

  public static int serch(int[] schedule,int targetTime){
    int low = 0;
    int high = schedule.length -1;
    int index = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(targetTime == schedule[mid]){
                index = mid;
                high = mid-1;
            }
            else if(targetTime < schedule[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return index;
    }
  }
