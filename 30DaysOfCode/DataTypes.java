import java.io.*;
import java.util.*;

public class DataTypes {
int i = 4;
double d = 4.0;
String s = "HackerRank" ;

 public void dispaly(){
    
    Scanner sc = new Scanner(System.in);
    int i2 = sc.nextInt();
    double d2 = sc.nextDouble();
      sc.nextLine(); 
        String str = sc.nextLine(); 
        
    
         System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s + " " +str);
    }
    public static void main(String[] args) {
DataTypes obj = new DataTypes();
obj.dispaly();
       
    }
}
