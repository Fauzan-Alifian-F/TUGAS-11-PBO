import java.util.InputMismatchException;
import java.util.Scanner;

public class Contoh2 {
    public static void main(String[] args) {
        Scanner input = new Scanner("System.in");
        try {
            System.out.println("Masukan Angka:");
            int angka = input.nextInt();
            System.out.println("Anda memasukan: " + angka);
        }
        catch (Exception e) {
            System.out.println("Angka yang anda masukan tidak valid!!");
        }
    }
}
