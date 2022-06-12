import java.util.Scanner;

public class alt_additions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k <t ; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b>a){
                int d= b-a;
                if(d%3==2){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}
