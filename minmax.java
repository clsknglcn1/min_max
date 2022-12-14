import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("kaç adet sayı gireceksiniz:");
        int a= num.nextInt();
        System.out.println("sayıları arka arakaya giriniz:");


        for (int i =1; i<=a; i++){
            System.out.println(i+".sasyıyı giriniz:");
            int sayi = num.nextInt();
            if (i==1){
                max=sayi;
                min=sayi;

            }
            if (sayi>max)
                max=sayi;
            if (sayi<min)
                min=sayi;
        }
        System.out.println("girdiginiz sayılar : ");
        System.out.println("girdiginiz sayılar icinden en buyuk olani: "+max);
        System.out.println("girdiginiz sayılar icinden en kucuk olani: "+min);
    }

    }

