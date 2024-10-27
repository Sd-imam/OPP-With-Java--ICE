package beginnerjava;

import java.util.Scanner;

public class WrapperDemo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num;
        int k=1;
        num=input.nextInt();
        
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
        
    }
}
