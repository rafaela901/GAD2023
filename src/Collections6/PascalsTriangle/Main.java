package Collections6.PascalsTriangle;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        PascalTriangle pt = new PascalTriangle();

        Scanner in = new Scanner(System.in);
        System.out.print("n=");
        int n = in.nextInt();

        pt.printTriangle(n);
    }
}
