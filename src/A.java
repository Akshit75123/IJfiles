import java.lang.String;
import java.util.*;


public class A {
    public static void main(String[] args) {
        int[] arr = {10,4,2,1};

        int s=0,d=0;
        for (int i = 0; i < 5; i++) {
            if (i%2==0){
                s+=arr[i];
            } else {
                d+=arr[i];
            }
        }
        System.out.println(s+" "+d);
    }
}

