import java.sql.SQLOutput;

public class STD1 {

    public static void main(String[] args) {
        //membuat perhitungan Luas Persegi Panjang
        // p=20 l=30 Luas=?

        int panjang; // int adalah integer
        int lebar; //integer
        int Luas; //integer

        panjang = 20;
        lebar = 30;
        Luas = panjang * lebar;

        System.out.println("Luasnya Adalah = " + Luas);

        //membuaat perhitungan luas segitiga
        //alas = 10 tinggi =7 luas=?

        double alas = 10;
        double tinggi = 7;
        double Luassegitiga =  alas * tinggi * 0.5;

        System.out.println("Luassegitiga Adalah = " +Luassegitiga);

        //statment IF

        if (Luassegitiga < 50){
            System.out.println("maka Luassegitiga kurang dari 50");
        }
        if (Luassegitiga > 50){
            System.out.println("maka Luassegitiga lebih dari 50");
        }

    }
}
