package practice;

import java.util.*;

public class kthminmaxarray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr); 

        int kthMin = arr[k-1];
        int kthMax = arr[arr.length-k];

        System.out.println(k + "rd Min = " + kthMin);  // 7
        System.out.println(k + "rd Max = " + kthMax);  // 10
    }
}
