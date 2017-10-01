import java.util.Scanner;

public class Class10_09_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        double count = 0;
        double sum = 0;
        do { if ((x1%10)!=3)
        { sum += x1;
            count++;
        } x1 = sc.nextInt();

        }while (x1>0);
        sum/=count;
        if (count==0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", sum);
        }}}