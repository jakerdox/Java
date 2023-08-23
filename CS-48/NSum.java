import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int num = 0;
        int sum = 0;


        n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            num = input.nextInt();
            sum += num;
        }

        System.out.println(sum);
        input.close();
    }
}
