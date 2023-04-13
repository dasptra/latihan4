
import java.util.HashMap;
import java.util.Scanner;

public class lat4 {
    String nama, kelas, matkulPraktikum;
    int nim;
    public lat4(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, lat4> mhs  = new HashMap<>();
        String input;
        lat4 data;

        mhs.put("1", new lat4("putri", "3H", "Struktur Data", 20200000));
        mhs.put("2", new lat4("agus", "3A", "Matematika", 2021));
        mhs.put("3", new lat4("Arroy", "3D", "Pemograman", 2022));
        System.out.print("Masukan ID : ");
        input = in.nextLine();
        data = mhs.get(input);

        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + " " + data.kelas + " " + data.matkulPraktikum + " " + data.nim);
        }
        in.close();

    }
}