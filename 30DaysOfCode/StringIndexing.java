import java.util.Scanner;

public class StringIndexing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine(); 
        for (int t = 0; t < T; t++) {
            String s = scanner.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even.append(s.charAt(i));
                } else {
                    odd.append(s.charAt(i));
                }
            }
            
            System.out.println(even.toString() + " " + odd.toString());
        }
        
        scanner.close();
    }
}
