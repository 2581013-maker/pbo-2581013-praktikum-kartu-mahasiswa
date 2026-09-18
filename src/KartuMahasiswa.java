import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("NIK (16 digit) : ");
        String NIK = input.nextLine();

        System.out.print("Umur           : ");
        int umur = input.nextInt();

        System.out.print("Tinggi Badan cm : ");
        double tinggi = input.nextDouble();

        System.out.print("Golongan darah : ");
        char golonganDarah = input.nextBoolean();






    }
}