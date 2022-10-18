import java.util.Scanner;

class CtoFConverter

{
    public static void main(String[] args) {

        String trash = "";
        double C =100;
        double F;


        Scanner in = new Scanner(System.in);


        F = (C * 9/5) + 32;
        System.out.println("Temperature in celsius: ");
        if (in.hasNextDouble()) {
            C = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number");
        }
        System.out.println("Temperature in fahrenheit: " + F);
    }
}