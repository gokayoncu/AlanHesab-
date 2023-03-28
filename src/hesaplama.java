import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        int r,𝛼;
        double pi =3.14,daireAlan;

        Scanner input= new Scanner(System.in);
        System.out.print("Dairenin yarı çapını girin :");
        r= input.nextInt();
        System.out.print("Dairenin Merkez Açısını giriniz :");
        𝛼=input.nextInt();
        daireAlan=(pi * (r*r) * 𝛼) / 360;
        System.out.print("Dairenin Alanı: "+daireAlan);


    }
}
