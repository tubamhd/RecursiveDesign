import java.util.Scanner;

public class RecursiveDesign {
    static void RecursiveDesing(int n1){
        int temp = n1;
        System.out.print(temp + " ");

        do {
            temp -= 5;
            System.out.print(temp + " ");

        }while(temp>0);
        do {
            temp += 5;
            System.out.print(temp + " ");

        }while(temp != n1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number for Design:  ");
        int no = input.nextInt();
        RecursiveDesing(no);
    }
}
