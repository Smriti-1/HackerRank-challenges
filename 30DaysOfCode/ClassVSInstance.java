import java.io.*;
import java.util.*;

class Person {
    private int age;
    public Person(int age){
        this.age = age;
        if(age< 0){
           System.out.println("Age is not valid, setting age to 0."); 
           age = 0;
        }else{
            this.age=age;
        }
    }
    
    public void Stage(){
        if(age<13){
             System.out.println("You are young."); 
        }else if(age>=13 && age< 18){
             System.out.println("You are a teenager."); 
        }else{
             System.out.println("You are old."); 
        }
    } 
    
    public void ages(){
        age++;
    }
}
public class Solution {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
         for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.Stage();
            for (int j = 0; j < 3; j++) {
                p.ages();
            }
            p.Stage();
            System.out.println();
        }
        sc.close();
    }
}
