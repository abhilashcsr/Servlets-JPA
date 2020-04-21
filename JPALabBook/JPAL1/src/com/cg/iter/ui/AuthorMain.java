package com.cg.iter.ui;

import java.util.Scanner;

import com.cg.iter.bean.Author;
import com.cg.iter.service.AuthorServiceImpl;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//import com.cg.iter.bean.Author;
//import com.cg.iter.service.AuthorServiceImpl;

public class AuthorMain {


	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AuthorServiceImpl service = new AuthorServiceImpl();
		try {
			while(true) {
			
				//Menu 
				System.out.println("---------MENU--------");
				System.out.println("1. Enter New Author");
				System.out.println("2. Update Author");
				System.out.println("3. Delete Author");
				System.out.println("4. find Author");
				System.out.println("5. Exit");
				System.out.println("Enter your choice");
			
				String choice = null;
				switch(choice) {
					case "1":
					//Adding Author
						Scanner scan = new Scanner(System.in);
						System.out.println("Enter <Author id> <First name> <middle name> <last name> <phone no>");
						Author author = new Author( scan.nextInt(),scan.next(), scan.next(),scan.next() ,scan.nextLong());
//						System.out.println("Enter author id");
//						int aid = Integer.parseInt(br.readLine());
//						author.setAuthorId(aid);
//						System.out.println("Enter firstname");
//						author.setFirstName(br.readLine());
//						System.out.println("Enter middlename");
//						author.setMiddleName(br.readLine());
//						author.setLastName(br.readLine());
//						System.out.println("Enter phone number");
//						author.setPhoneNo(br.readLine());
						if(service.addAuthor(author)) {
							System.out.println("author added");
						}else {
							System.out.println("author not added");
						}
						break;
					case "2":
					//Updating Author
						System.out.println("Enter author id");
//						Integer id = Integer.parseInt(br.readLine());
						Scanner scan1 = new Scanner(System.in);
						author = service.findAuthor(scan1.nextInt());
						if(author != null) {
							System.out.println("Author eixst");
							System.out.println(author.toString());
							Author temp = new Author(scan1.nextInt(),scan1.next(), scan1.next(),scan1.next() ,scan1.nextLong());
							temp.setAuthorId(author.getAuthorId());
//							System.out.println("Enter firstname");
//							temp.setFirstName(br.readLine());
//							System.out.println("Enter middlename");
//							temp.setMiddleName(br.readLine());
//							System.out.println("Enter lastname");
//							temp.setLastName(br.readLine());
//							System.out.println("Enter phone number");
//							temp.setPhoneNo(br.readLine());
							if(service.updateAuthor(temp)!=null) {
								System.out.println("Author updated");
							}else {
								System.out.println("Not updated");
							}
						}else {
							System.out.println("Author does not exist");
						}
						break;
					case "3":
					//Deleting Author
						System.out.println("Enter author id");
						
						Scanner scan3 = new Scanner(System.in);
//						author = service.findAuthor(scan3.nextInt());
	                   int	id=scan3.nextInt();
						
						if(service.deleteAuthor(id)) {
							System.out.println("Author deleted");
						}else {
							System.out.println("Author not deleted");
						}
						break;
					case "4":
						//finding Author
							
//							System.out.println("Enter author id");
//							Author temp = new Author();
////							Integer id1 = Integer.parseInt(br.readLine());
//							temp = service.findAuthor(scan.nextInt());
////							id1 = Integer.parseInt(br.readLine());
//							if(service.findAuthor(temp) != null) {
//								System.out.println("author find");
//							}else {
//								System.out.println("Author not found");
//							}
//							break;
					System.out.println("Enter author id");
//					Integer id = Integer.parseInt(br.readLine());
					Scanner scan2 = new Scanner(System.in);
						author = service.findAuthor(scan2.nextInt());
						if(author != null) {
							System.out.println("Author eixst");
							System.out.println(author.toString());
							Author temp = new Author(scan2.nextInt(),scan2.next(), scan2.next(),scan2.next() ,scan2.nextLong());
							temp.setAuthorId(author.getAuthorId());
						}
//							System.out.println("Enter firstname");
//							temp.setFirstName(br.readLine());
//							System.out.println("Enter middlename");
//							temp.setMiddleName(br.readLine());
//							System.out.println("Enter lastname");
//							temp.setLastName(br.readLine());
//							System.out.println("Enter phone number");
//							temp.setPhoneNo(br.readLine());
//							if(service.updateAuthor(temp)!=null) {
//								System.out.println("Author updated");
//							}else {
//								System.out.println("Not updated");
//							}
//						}else {
//							System.out.println("Author does not exist");
//						}
//						
//						
						
					default:
						System.exit(0);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	}


