import java.util.Scanner;

public class daire{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        double yaricap;
        System.out.println("Lütfen dairenin yariçapını giriniz:  ");
        yaricap=input.nextDouble();

        double alan, cevre, pi=3.14;
        alan=pi*yaricap*yaricap;
        cevre=2*pi*yaricap;

        System.out.println("Dairenin alanı:  "+alan);
        System.out.println("Dairenin çevresi:  "+cevre);
        

    



    }
}