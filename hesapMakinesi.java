package patikadev;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n1,n2,islem;
        System.out.println("lütfen ilk sayıyı giriniz: ");
        n1 = girdi.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz: ");
        n2 = girdi.nextInt();
        System.out.println("1:toplama\n2:çıkarma\n3:çarpma\n4:bölme");
        System.out.println("işleminizi seçiniz!");
        islem = girdi.nextInt();
        switch(islem){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 != 0){
                    System.out.println(n1 / n2);
                    break;
                    }else{
                    System.out.println("bölme işleminde bölen 0 olamaz!");
                    break;

                }
            default :
                System.out.println("hatalı seçim yaptınız!");
                }






        }


    }


