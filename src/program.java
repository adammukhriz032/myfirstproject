import java.util.Scanner;
public class program {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int purata;
        int counter = 0;
        while (counter < 20) {
            grade = input.nextInt();//grade akan berlainan nmbr dan x fix
            total = total + grade;//baca coding daripada kanan ke kiri
            counter++;
        }
    purata = total / 10;
    System.out.println("total purata ialah " + purata);
    }
}
//average = purata 
//purata = total /(bahagi) nmbr
// 1 + 2 + 3 + 4 +  5 / 10n