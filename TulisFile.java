import java.io.FileWriter;
import java.io.IOException;

public class TulisFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("file.txt");
            f.write("Belajar Pemograman File Handling 2");
            f.close();
            System.out.println("Proses Berhasil !!");
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan dalam penuisan file!!");
            e.printStackTrace();
        }
    }
}
