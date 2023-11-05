import java.util.Scanner;
public class milo {
    public static void main(String args[]) {
        //main class
        Scanner input = new Scanner(System.in);
        nasi_lemak mukhriz = new nasi_lemak();


        System.out.println("Enter your name here:");
        String name = input.nextLine();
        mukhriz.simpleMessage(name);
    }
}
