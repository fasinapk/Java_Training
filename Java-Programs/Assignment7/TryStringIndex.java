//2.Write a program to implement try catch block for String Index Out of Bounds.

package Assignment7;

import java.util.Scanner;

public class TryStringIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input text : ");
        try{
            char c = sc.nextLine().charAt(15);
            System.out.println("The character at index 4 is : "+c);
        }catch(Exception e){
            //StringIndexOutOfBoundsException cannot be caught explicitly
            System.out.println("Caught exception : "+e);
        }
		

	}

}
