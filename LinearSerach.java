import java.util.Arrays;

public class LinearSerach {
    static int[] element=new int[10000000];
  static  int count=0;
//    public static int[] addElements(){
//
//
//        for (int i = 0; i < element.length; i++) {
//            element[i]=count;
//            count++;
//        }
//        return element;
//    }
    public static int lSearch(int[] arr,int target,int start, int end) {
        int index=0;
        if (arr.length!=0){
        for (int i = start; i <end; i++) {
            if (arr[i] == target) {
                index =i;
                break;
            }else {
                index=-1;
            }
        }
        }
        return index;
    }
    public static void main(String[] args) {
         int[] arr = {0,9,5,4,3,6,7,8};
         int start=0;
         int end= arr.length;
         int target=8;
 //       addElements();
        int ans = lSearch(arr,target,start,end);
         System.out.println("The index of the target is: "+ans);

    }
}
