package com.example.weekthreechallenge;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.tomcat.jni.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 1;
        boolean available = false;
        Book aBook;
        String answer = "";
        String menuAnswer = "";
        boolean menuDone = true;

        ArrayList<Book> books = new ArrayList<>();
        


        do {

            System.out.println("1. List of Books");
            System.out.println("2. Borrowed Books");
            System.out.println("3. Available Books");
            System.out.println("4. To Add Books");
            System.out.println("5. To Borrow Books");


            System.out.println("Enter Your Choices From The Menu");
            choice = scan.nextInt();
            scan.nextLine();

            if(choice==1){
                System.out.println("List of Books:");
            }


            if (choice == 4) {


                do {
                    aBook=new Book();
                    System.out.println("Enter the Title of Book:");
                    aBook.setTitle(scan.nextLine());

                    System.out.println("Enter Author:");
                    aBook.setAuthor(scan.nextLine());


                    System.out.println("Enter Year Of Publication:");
                    aBook.setYearofpublication(scan.nextInt());
                    scan.nextLine();

                    System.out.println("Enter ISBN Number:");
                    aBook.setISBNNumber(scan.nextLine());

                books.add(aBook);


                if (choice == 3) {


                    System.out.println("Do You want borrow The Book?");
                    answer = scan.nextLine();

                    if (answer.equalsIgnoreCase("no")) {
                        available = true;

                    } else{
                        System.out.println("To Borrow Book Press 5");
                    }
                }

            } while (available) ;

        }


                    System.out.println("Do you want to see the menu again");
                    menuAnswer = scan.nextLine();

                    if (menuAnswer.equalsIgnoreCase("no") || menuAnswer.equalsIgnoreCase("n"))
                        menuDone = false;
                    else menuDone = true;


                } while (menuDone);

            }
        }


















