import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total=1,numberLength=0,result=0;
        System.out.print("Sayi Giriniz : ");
        number = input.nextInt();
        int copyNumber=number,copyNumber2 = number;

        while (copyNumber!=0) {
            copyNumber = copyNumber/10;
            numberLength++;
        }

        for (int i=1;i<=numberLength;i++) {
            int a = copyNumber2%10;
                for(int j=1;j<=numberLength;j++) {
                    total=total*a;

                }
                result +=total;
                total=1;
                copyNumber2=copyNumber2/10;
        }
        System.out.println(result==number ? number + " sayısı bir Armstrong sayıdır." : number + " sayısı bir Armstrong sayı değildir.");
    }
}
