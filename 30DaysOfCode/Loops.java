import java.io.*;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for(int i = 1 ; i <=10 ;i++){
            System.out.println(n +" x "+ i +" = "+ n*i);
        }
    }
}
