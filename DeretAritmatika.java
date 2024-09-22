import java.util.Scanner;

public class DeretAritmatika {
    public static void main(String[] args) {
        int batasAtas, batasBawah, beda, hasil = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bawah: ");
        batasBawah = input.nextInt();
        System.out.print("Masukkan batas atas: ");
        batasAtas = input.nextInt();
        System.out.print("Masukkan beda: ");
        beda = input.nextInt();

        System.out.println("Deret aritmatika: ");
        for (int i = batasBawah; i <= batasAtas; i+= beda) {
            System.out.println(i + " . ");
        }
        System.out.println();
    }

}

