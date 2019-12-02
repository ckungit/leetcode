package study.train;

import java.util.Arrays;

public class QuickSort {
    public int divide(int[] a, int start, int end){
        int base = a[end];
        while(start < end){
            while (start < end && a[start] <= base){
                start++;
            }
            if(start < end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end--;
            }
            while(start < end && a[end] >= base){
                end--;
            }
            if(start < end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
            }
        }
        return end;
    }

    public void sort(int[] a, int start, int end){
        if(start > end){
            return;
        }
        else{
            int partition = this.divide(a, start, end);
            this.sort(a, start, partition - 1);
            this.sort(a, partition + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,6,1,9,4,7,10,8};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a, 0 , a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
