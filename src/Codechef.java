
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    int DivisiblebyEight(String s){
        long n=Long.parseLong(s);
        if (n%8==0){
            return 1;
        } else {
            return -1;
        }
    }
}
