package LatihanSoal4;
public class Latihan4A {

public static void main(String[] main) {
        int sukuPertama = 5; //Inisialisasi variabel suku pertama
        int selisih = 5; //Inisialisasi variabel selisih
        int updateNilai; //Inisialisasi variabel update nilai
        int total = 0; //Inisialisasi variabel total
        
        for(int i = 1; i <= 4; i++){ //Untuk membuat perulangan vertikal
            for(int a = 1; a <= i; a++){ //Untuk membuat perulangan horizontal
                updateNilai = sukuPertama;
                sukuPertama += selisih;
                System.out.print(" "+updateNilai);
            }
            System.out.println(" ");
        }
    }
}
