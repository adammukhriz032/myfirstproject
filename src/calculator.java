import java.util.Scanner;
public class calculator {
    public static void main (String args[]){
        Scanner adam = new Scanner(System.in);
        int nombor_pertama,nombor_kedua,jawapan;
        System.out.println("nombor pertama : ");
        nombor_pertama = adam.nextInt ();
        System.out.println("nombor kedua : ");
        nombor_kedua = adam.nextInt ();
        jawapan = nombor_pertama % nombor_kedua;
        System.out.println (jawapan);
    }
}

