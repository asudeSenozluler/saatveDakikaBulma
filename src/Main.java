import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int saniye=0,saat=0,dakika=0,degisken=0;
        System.out.println("Saniye değerini girin: ");
        saniye=scanner.nextInt();
        saat=saniye/3600;
        dakika=(saniye/60)-60;
        saniye=saniye%60;
        System.out.println(saat+":"+dakika+":"+saniye);
	// write your code here
    }
}
