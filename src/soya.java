import java.util.Scanner;
public class soya {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        spageti adam = new spageti();
        System.out.println("enter your name here");
        String name = input.nextLine();
        adam.simpleMessage(name);
    }
}
