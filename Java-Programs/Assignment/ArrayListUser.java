//4.Create an arraylist of user-defined data type Book. it should have:-
//i)Name of the Book
//ii)Author of the book
//iii)year of publication of the book
//iV)numer of copies sold.
//sort the array list based on the year of publication.

package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Book
{  
	int yop;  
	String name,author;  
	int qty;  
	public Book(int yop, String name, String author, int qty) 
	{  
    this.yop = yop;  
    this.name = name;  
    this.author = author;  
    this.qty = qty;  
	}  
}
class yopComparator implements Comparator<Book>
{
	public int compare(Book b1, Book b2)
	{
		if(b1.yop == b2.yop)
			return 0;
		else if(b1.yop > b2.yop)
			return 1;
		else
			return -1;
	}
}


public class ArrayListUser {

	public static void main(String[] args) {
        ArrayList<Book> arrList = new ArrayList<Book>();
		
		arrList.add(new Book(2015,"Into the wild","Arun",12));
		arrList.add(new Book(2004,"Roads & Mountains","Varshit",6));
		arrList.add(new Book(2020,"Scientific Football","Sayed",10));
		arrList.add(new Book(1998,"Guns & Roses","Lilwayne",20));
		System.out.println("Before sorting");
		System.out.println("-----------------------------");
		for(Book str1: arrList)
		{
			System.out.println(str1.yop + " " +str1.name +" "+str1.author+" "+str1.qty);
		}
		System.out.println();
		
		System.out.println("after sorting");
		System.out.println("---------------------");
		Collections.sort(arrList, new yopComparator() );
		for(Book str: arrList)
		{
			System.out.println(str.yop + " " +str.name +" "+str.author+" "+str.qty);
		}



	}

}





//class Book{  
//	    
//	  String name;
//	  String author;
//	  int year; 
//	  int copy;
//	  Book(String name,String author,int year,int copy){  
//	    
//	   this.name=name;  
//	   this.author=author; 
//	   this.year=year; 
//	   this.copy=copy;  
//	  }  
//	}
//
//public class ArrayListUser {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Book> b=new ArrayList<Book>(); 
//		Book b1=new Book("wings of fire","APJ Abdul Kalam",2020,100); 
//		Book b2=new Book("2 states","Chetan Bhagat",2017,50); 
//		Book b3=new Book("harry potter","JK Rowling",2005,200); 
//		Book b4=new Book("romeo&julliet","William Shakesphere",2012,150);		
//		b.add(b1);
//		b.add(b2);
//		b.add(b3);
//		b.add(b4);
//		Iterator itr=b.iterator(); 
//		
//		while(itr.hasNext())
//		{
//			Book bk=(Book)itr.next();  	
//		    System.out.println(bk.name+" , "+bk.author+" , "+bk.year+" , "+bk.copy);
//		    System.out.println("--------------------------------------------");
//		}
//
//	}
//
//}
