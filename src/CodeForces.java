import java.util.*;

public class CodeForces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        String str = sc.nextLine();

        int cal=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='1')
                cal+=arr[0];
            else if (str.charAt(i)=='2')
                cal+=arr[1];
            else if (str.charAt(i)=='3')
                cal+=arr[2];
            else if (str.charAt(i)=='4')
                cal+=arr[3];
        }
        System.out.println(cal);

    }
}