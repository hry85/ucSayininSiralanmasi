import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc=new Scanner(System.in);

        System.out.print("1. sayi : ");
        a=sc.nextInt();

        System.out.print("2. sayi : ");
        b=sc.nextInt();

        System.out.print("3. sayi : ");
        c=sc.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        }else if((b > a ) && (b > c)){
            if (a > c ){
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        }else {
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
        System.out.println("------------");
        System.out.println("Kucukten buyuge siralama");

        if ((a < b) && (a < c )) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }else if ((b < a) && (b < c)) {
                if (a < c) {
                    System.out.println("b < a < c");
                } else {
                    System.out.println("b < c < a");
                }
            }else{
                if (a < b){
                    System.out.println("c < a < b");
                }else {
                    System.out.println("c < b < a");
                }
            }
        }
    }
