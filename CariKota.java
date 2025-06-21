public class CariKota {
    public static void main(String[] args) {
        String placeBirth[] = {"JAKARTA", "SURABAYA","MALANG","SUKABUMI","MAGELANG"};

        int totalcity = 0;
        for (int i = 0; i <placeBirth.length; i++){
            char prefix = placeBirth[i].charAt(0);
            if (prefix == 'S') {
                totalcity++;
            }
        }

        System.out.println(totalcity);
    }
}
