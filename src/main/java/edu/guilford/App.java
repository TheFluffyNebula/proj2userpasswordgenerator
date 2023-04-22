package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scan = new Scanner(System.in);
        User person1 = new User("person","one","person1@gmail.com","pet1");
        User person2 = new User("person","two","person2@gmail.com","pet2");
   
        System.out.println("hello person1, what is your favorite color?");
        String favColor = scan.nextLine();
        String p1Password = person1.generatePassword(favColor);
        // original output for substring(indexes o-1): p1pp, 4 chars probably not strong enough
        // changed to color, first name, last initial, pet name first 3 chars, email first 3 chars
        System.out.println("person1 password: "+p1Password);
        System.out.println("person1 encrypted password: "+AES.encrypt(p1Password, "password"));
        System.out.println("person1 decrypted password: "+AES.decrypt(AES.encrypt(p1Password, "password"), "password"));
    
        System.out.println("hello person2, what is your favorite color?");
        String favColor2 = scan.nextLine();
        String p2Password = person2.generatePassword(favColor2);
        System.out.println("person2 password: "+p2Password);
        System.out.println("person2 encrypted password: "+AES.encrypt(p2Password, "password"));
        System.out.println("person2 decrypted password: "+AES.decrypt(AES.encrypt(p2Password, "password"), "password"));
    
        scan.close();
    }
}
