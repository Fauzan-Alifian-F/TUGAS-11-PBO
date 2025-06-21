import java.io.FileNotFoundException;

public class Contoh1 {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0;
            System.out.println("Hasil: " + hasil);
        
        }
        catch (ArithmeticException e){
            System.out.println("Terjadi error: Tidak bisa di bagi dengan nol ");
        }
        
    }
}
