package net.mlwall.pool;
import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);
    static int choice;
    static boolean exit = false;
    static String user;
    
    public static void CLS() // Clears console. Tried several things to mimic cls though couldn't get any of them to actually work in the NetBeans console.
    {                        // This kinda works, though it's ugly.
        for(int i = 0; i < 500; i++)
        {
            System.out.println("\b");
        }
    }
    
    public static void doExit()
    {
        System.out.println("1: Back | 2: Exit");
        choice = input.nextInt();
        
        switch (choice)
        {
            case 1:
                CLS();
                break;
            case 2:
                exit = true;
                break;
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Please enter a username: ");
        user = input.next();
        while (!exit)
        {
            System.out.println("1: Rectangular | 2: Circular | 3: Exit");
            choice = input.nextInt();
            CLS();
            switch (choice)
            {
                case 1:
                    Math.rect();
                    doExit();
                    break;
                    
                case 2:
                    Math.circular();
                    doExit();
                    break;
                    
                case 3:
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid Option! Please enter a valid option.");
                    try
                    {
                        Thread.sleep(3000); // Sleeps for 3000 milliseconds.
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    CLS();
            }
        }
    }
}
