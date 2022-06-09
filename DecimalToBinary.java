import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int m, n, i = 0, binary = 0;

        System.out.print("\nDecimal Number: ");
        n = scan.nextInt();

        int[] num = new int[10];

        while(n!=0){

            binary = n % 2;

            num[i] = binary;

            i++;

            n = n / 2;

        }

        m = i-1;

        System.out.print("\nBinary Number: ");

        while (m >= 0) {

            System.out.print(num[m] + " ");

            m--;

        }

        System.out.print("\n");

        scan.close();

    }
}