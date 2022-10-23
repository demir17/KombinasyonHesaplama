import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , r , farkFak, komb, temp= 1 ;

        System.out.println("Lütfen ilk sayıyı (N) giriniz: ");
        n = sc.nextInt();

        System.out.println("Lütfen ikinci sayıyı (R) giriniz: ");
        r= sc.nextInt();
        farkFak = n - r;

        for (int i = 1 ; i<= n; i++){
           temp  *= i;
        }

        n = temp;
        temp = 1;


        for (int i = 1 ; i<= r; i++){
            temp  *= i;
        }

        r = temp;
        temp = 1;

        for (int i = 1 ; i<= farkFak; i++){
            temp  *= i;
        }
        farkFak = temp;
        temp = 1;

        komb = n / (r * farkFak);
        System.out.println("N ve R kombinasyon: " + komb);

    }
}
