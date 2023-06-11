import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double[] here = {-2.8, 2.3, 8.3, 5.6, 3.4 , 3.6, 20.5, 3.2, 5.5, 4, -6.5, 4, 2.7, -4.3, 5.4,};
        double result = 0;
        double count =0;
        boolean bool=false;
        for (double thare: here){
           if(thare<0) {
               bool = true;
           }else if(thare >0 && bool){
               result += thare;
               count++;
           }
        }
        System.out.println("Среднее значение ареф-е число: "+ result/count);
    }


}