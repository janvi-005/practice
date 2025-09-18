package practice;
import java.util.*;

public class unionintersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                union.add(arr1[i++]);
            } else if(arr1[i] > arr2[j]) {
                union.add(arr2[j++]);
            } else {
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++; j++;
            }
        }

        while(i < arr1.length) union.add(arr1[i++]);
        while(j < arr2.length) union.add(arr2[j++]);

        System.out.println("Union = " + union);
        System.out.println("Intersection = " + intersection);
    }
}
