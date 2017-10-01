import java.util.Scanner;

public class Second_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int count = 0;
        do { if ((x1%10)%2!=0)  {
                count = x1 % 10;
                break; }
            x1/=10;
        }while (x1!=0);

        if (count==0) {
            System.out.println("NO");
        } else {
            System.out.println(count);
        }}}