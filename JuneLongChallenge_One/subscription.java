import java.util.Scanner;

public class subscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n%6==0){
                System.out.println((n/6)*x);
            }
            else {
                System.out.println(((int)(n/6)+1)*x);
            }

        }
    }
}
