package ArrayinDSA;
// Array is the linear data strucuture
//Find the element x in  the array. Take array and x as input
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 12, 15, 20, 25, 30, 35, 40, 45, 50, 69};
        int k = 5;
        boolean flag=false;// vetyena
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                flag = true;

                break;
            }
        }
              if (flag = false)
            System.out.println("Element  is not found at index " );
              else System.out.println("Element  is  found at index " + k);
        }
    }


