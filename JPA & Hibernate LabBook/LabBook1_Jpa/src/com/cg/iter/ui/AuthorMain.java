package com.cg.iter.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.iter.entity.Author;
import com.cg.iter.service.AuthorService;
import com.cg.iter.service.AuthorServiceImpl;


public class AuthorMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AuthorService service = new AuthorServiceImpl();
		int choice=0;
		choice=getChoice(sc);
		switch (choice) {
		case 1:
			System.out.println("Create Author");
			System.out.println("Enter <ID> <First Name> <Middle Name> <Last Name> <Phone Number> ");
			Author auth = new Author(sc.nextInt(),sc.next(),sc.next(),sc.next(), sc.nextLong());
			boolean success = service.create(auth);
			if(success) 
			{
				System.out.println("Author Created");
			}
			else 
			{
				System.out.println("Could not create author");
			}
			break;
		case 2:
			System.out.println("update Author");
			System.out.println("Enter author id");
			 auth= service.getAuthor(sc.nextInt()) ;
			if(auth!=null) {
				System.out.println("Author eixst");
				System.out.println("Enter <First Name> <Middle Name> <Last Name> <Phone Number>");
				auth.setFirstname(sc.next());
				auth.setMiddlename(sc.next());
				auth.setLastname(sc.next());
				auth.setPhoneno(sc.nextLong());
				boolean success1 = service.update(auth);
				if(success1) 
				{
					System.out.println("Author updated");
				}
				else 
				{
					System.out.println("Author not found");
				}
			}
			break;
		case 3:
			System.out.println("find Author");
			System.out.println("enter authorid");
			 auth= service.getAuthor(sc.nextInt()) ;
			 if(auth!=null)
			 {
					System.out.println("Author found");
				}
				else 
				{
					System.out.println("Author not found");
				}
			
			break;
		case 4:
			System.out.println("Delete Author");
			System.out.println("enter the id to delete");
			auth= service.getAuthor(sc.nextInt()) ;
			boolean success2 = service.delete(auth);
			if(success2)
			{
				System.out.println("author deleted");
			}else
			{
				System.out.println("author not deleted");
			}
			break;
		case 5:
			System.out.println("Exiting Program");
			System.exit(0);
			break;

		default:
			System.out.println("Enter 1 to 4 only");
			break;
		}
	}
	

	private static int getChoice(Scanner sc) {
		int choice=0;
		System.out.println("Author Management");
		System.out.println("1. Create Author");
		System.out.println("2. Update Author");
		System.out.println("3. Find Author");
		System.out.println("4. Delete Author");
		System.out.println("5. Exit Program");
		try {
			choice = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Please choose a number");
				sc.nextLine();
			}
			return choice;
	
	}

}
