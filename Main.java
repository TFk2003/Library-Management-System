package com.company;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final char CHAR = '*';
    private static final String LINE_SEPARATOR = "line.separator";

    public static void main(String[] args) throws InterruptedException, IOException {
        lms();
        Thread.sleep(3000);
        Admin();
    }

    private static void lms() throws InterruptedException, IOException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n\n");
        System.out.print("\t\t\t\t                   __        ______  _______   _______    ______   _______  __      __                    \n");
        System.out.print("\t\t\t\t                  |  \\      |      \\|       \\ |       \\  /      \\ |       \\|  \\    /  \\                   \n");
        System.out.print("\t\t\t\t                  | $$       \\$$$$$$| $$$$$$$\\| $$$$$$$\\|  $$$$$$\\| $$$$$$$\\\\$$\\  /  $$                   \n");
        System.out.print("\t\t\t\t                  | $$        | $$  | $$__/ $$| $$__| $$| $$__| $$| $$__| $$ \\$$\\/  $$                    \n");
        System.out.print("\t\t\t\t                  | $$        | $$  | $$    $$| $$    $$| $$    $$| $$    $$  \\$$  $$                     \n");
        System.out.print("\t\t\t\t                  | $$        | $$  | $$$$$$$\\| $$$$$$$\\| $$$$$$$$| $$$$$$$\\   \\$$$$                      \n");
        System.out.print("\t\t\t\t                  | $$_____  _| $$_ | $$__/ $$| $$  | $$| $$  | $$| $$  | $$   | $$                       \n");
        System.out.print("\t\t\t\t                  | $$     \\|   $$ \\| $$    $$| $$  | $$| $$  | $$| $$  | $$   | $$                       \n");
        System.out.print("\t\t\t\t __       __   ______$$$__$$ \\__$$$______$$$$______  \\________ \\__ \\$$   __$ ________  __    __  ________ \n");
        System.out.print("\t\t\t\t|  \\     /  \\ /      \\ |  \\  |  \\ /      \\  /      \\ |        \\|  \\     /  \\|        \\|  \\  |  \\|        \\\n");
        System.out.print("\t\t\t\t| $$\\   /  $$|  $$$$$$\\| $$\\ | $$|  $$$$$$\\|  $$$$$$\\| $$$$$$$$| $$\\   /  $$| $$$$$$$$| $$\\ | $$ \\$$$$$$$$\n");
        System.out.print("\t\t\t\t| $$$\\ /  $$$| $$__| $$| $$$\\| $$| $$__| $$| $$ __\\$$| $$__    | $$$\\ /  $$$| $$__    | $$$\\| $$   | $$   \n");
        System.out.print("\t\t\t\t| $$$$\\  $$$$| $$    $$| $$$$\\ $$| $$    $$| $$|    \\| $$  \\   | $$$$\\  $$$$| $$  \\   | $$$$\\ $$   | $$   \n");
        System.out.print("\t\t\t\t| $$\\$$ $$ $$| $$$$$$$$| $$\\$$ $$| $$$$$$$$| $$ \\$$$$| $$$$$   | $$\\$$ $$ $$| $$$$$   | $$\\$$ $$   | $$   \n");
        System.out.print("\t\t\t\t| $$ \\$$$| $$| $$  | $$| $$ \\$$$$| $$  | $$| $$__| $$| $$_____ | $$ \\$$$| $$| $$_____ | $$ \\$$$$   | $$   \n");
        System.out.print("\t\t\t\t| $$  \\$ | $$| $$  | $$| $$  \\$$$| $$  | $$ \\$$    $$| $$     \\| $$  \\$ | $$| $$     \\| $$  \\$$$   | $$   \n");
        System.out.print("\t\t\t\t \\$$      \\$$ \\$$   ______$ __\\$$ \\$__  \\______$$________$$________  __  \\$$ \\__$$$$$$ \\$$   \\$$    \\$$   \n");
        System.out.print("\t\t\t\t                   /      \\|  \\    /  \\ /      \\|        \\|        \\|  \\     /  \\                         \n");
        System.out.print("\t\t\t\t                  |  $$$$$$\\\\$$\\  /  $$|  $$$$$$\\\\$$$$$$$$| $$$$$$$$| $$\\   /  $$                         \n");
        System.out.print("\t\t\t\t                  | $$___\\$$ \\$$\\/  $$ | $$___\\$$  | $$   | $$__    | $$$\\ /  $$$                         \n");
        System.out.print("\t\t\t\t                   \\$$    \\   \\$$  $$   \\$$    \\   | $$   | $$  \\   | $$$$\\  $$$$                         \n");
        System.out.print("\t\t\t\t                   _\\$$$$$$\\   \\$$$$    _\\$$$$$$\\  | $$   | $$$$$   | $$\\$$ $$ $$                         \n");
        System.out.print("\t\t\t\t                  |  \\__| $$   | $$    |  \\__| $$  | $$   | $$_____ | $$ \\$$$| $$                         \n");
        System.out.print("\t\t\t\t                   \\$$    $$   | $$     \\$$    $$  | $$   | $$     \\| $$  \\$ | $$                         \n");
        System.out.print("\t\t\t\t                    \\$$$$$$     \\$$      \\$$$$$$    \\$$    \\$$$$$$$$ \\$$      \\$$                         \n");
    }
    private static void login() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t    .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--.\n");
        System.out.print("\t\t\t\t\t\t\t   / .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /\\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\                                                    /\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\ \\                                                  / /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /         WELCOME TO LIBRARY MANAGEMENT SYSTEM     \\ \\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/                                                    \\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\                FOR SIGN IN PRESS 1                 /\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\ \\                                                  / /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /               FOR SIGN UP PRESS 2                \\ \\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/                                                    \\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ \\/\\ \\.--..--..--..--..--..--..--..--..--..--..--..--..--./\\ \\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    \\/ /\\/ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ /\\/ /\n");
        System.out.print("\t\t\t\t\t\t\t    / /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\\n");
        System.out.print("\t\t\t\t\t\t\t   / /\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\\n");
        System.out.print("\t\t\t\t\t\t\t   \\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `' /\n");
        System.out.print("\t\t\t\t\t\t\t    `--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\n");

    }

    private static void Admin() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        login();
        Scanner obj = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t");
        String ch = obj.nextLine();
        String id = user(ch);
        Thread.sleep(2000);
        Work();
        System.out.print("\t\t\t\t\t\t\t");
        ch = obj.nextLine();
        Work2(ch);
    }

    private static String user(String ch) throws IOException, InterruptedException {
        String s = ch;
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        String id = "", sen, cid, cPas, pas = "", pas2;
        char[] password = new char[8];
        int nf = 0, flag, j;
        Scanner obj = new Scanner(System.in);
        switch (s) {
            case "1": {
                System.out.println("\n\n\t\t\t\t\t\t\tEnter Your ID");
                System.out.print("\t\t\t\t\t\t\t");
                id = obj.nextLine();
                while (id.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                }
                while (true) {
                    try {
                        password = PasswordField.getPassword("\t\t\t\t\t\t\tEnter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas = new String(password);
                    File myfile = new File("user.txt");
                    Scanner myReader = new Scanner(myfile);
                    while (true) {
                        boolean b = !myReader.hasNextLine();
                        if (b) break;
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR != sen.charAt(j)) {
                            j++;
                        }
                        cid = sen.substring(0, j);
                        cPas = sen.substring(j + 1, j + 9);
                        if (cid.equals(id) && cPas.equals(pas)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tSIGN-IN SUCCESSFUL");
                            return id;
                        }
                    }
                    myReader.close();
                    System.out.println("\n\n\t\t\t\t\t\t\tInvalid ID or Password\n\t\t\t\t\t\t\tTryAgain");
                    Thread.sleep(1000);
                    System.out.println("\n\n\t\t\t\t\t\t\tEnter Your ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                    while (id.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                        System.out.print("\t\t\t\t\t\t\t");
                        id = obj.nextLine();
                    }
                }
            }
            case "2": {
                while (0 == nf) {
                    File myfile = new File("user.txt");
                    if (!myfile.exists()) {
                        myfile.createNewFile();
                    }
                    Scanner myReader = new Scanner(myfile);
                    System.out.println("\t\t\t\t\t\t\tEnter Your ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    id = obj.nextLine();
                    while (id.isEmpty()) {
                        System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ID");
                        System.out.print("\t\t\t\t\t\t\t");
                        id = obj.nextLine();
                    }
                    flag = 0;
                    while (myReader.hasNextLine() && 0 == flag) {
                        sen = myReader.nextLine();
                        j = 0;
                        while (CHAR != sen.charAt(j)) {
                            j++;
                        }
                        cid = sen.substring(0, j);
                        if (id.equals(cid)) {
                            System.out.println("\n\n\t\t\t\t\t\t\tID already exist\n\t\t\t\t\t\t\tEnter new ID");
                            flag = 1;
                        }
                        if (0 == flag) {
                            nf = 1;
                        }
                    }
                    myReader.close();
                    if (0 == flag) {
                        nf = 1;
                    }
                }
                flag = 0;
                while ((0 == flag)) {
                    try {
                        password = PasswordField.getPassword("\t\t\t\t\t\t\tEnter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas = new String(password);
                    try {
                        password = PasswordField.getPassword("\t\t\t\t\t\t\tRE-Enter Your Password: ");
                        while (null == password) {
                            System.out.print("\t\t\t\t\t\t\t");
                            password = PasswordField.getPassword("\n\t\t\t\t\t\t\tEnter Your Password: ");
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    assert null != password;
                    pas2 = new String(password);
                    if (pas2.equals(pas)) {
                        flag = 1;
                    } else {
                        System.out.println("\n\n\t\t\t\t\t\t\tPassword not matches\n\t\t\t\t\t\t\tRe-enter password");
                    }
                }
                FileWriter myWriter = new FileWriter("user.txt", true);
                myWriter.write(id + "*" + pas + "\n");
                myWriter.close();
                System.out.println("\n\n\t\t\t\t\t\t\t\tSIGN-UP SUCCESSFUL");
                return id;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(2000);
                start.waitFor();
                login();
                System.out.print("\t\t\t\t\t\t\t");
                s = obj.nextLine();
                id = user(s);
                return id;
            }
        }
    }

    private static void Work() throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        System.out.print("\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t   _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._\n");
        System.out.print("\t\t\t\t\t\t\t ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                   WELCOME TO SYSTEM                     ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         1. Add Book Information                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         2. Book Issue                                 ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         3. Book Location                              ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         4. Book Return                                ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )         5. Log Out                                    ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (                                                         ) )\n");
        System.out.print("\t\t\t\t\t\t\t ) )                                                       ( (\n");
        System.out.print("\t\t\t\t\t\t\t( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )\n");
        System.out.print("\t\t\t\t\t\t\t `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n");
    }

    private static void Work2(String ch) throws IOException, InterruptedException {
        Process start = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        start.waitFor();
        Book bk;
        IssuedBook ib;
        libraryBookedStudent lbs;
        ArrayList<Book> bookArrayList = new ArrayList<>();
        ArrayList<IssuedBook> issuedBookArrayList = new ArrayList<>();
        ArrayList<libraryBookedStudent> librarybookedStudentArrayList = new ArrayList<>();
        int i,j;
        File myfile = new File("books.txt");
        Scanner myReader = new Scanner(myfile);
        i = 0;
        while (myReader.hasNextLine()) {
            myReader.nextLine();
            i++;
        }
        myReader.close();
        for (j = 0; j < i; j++) {
            bk = retrieveBook(myfile, (j));
            bookArrayList.add(bk);
        }
        myfile = new File("issuedBooks.txt");
        myReader = new Scanner(myfile);
        i = 0;
        while (myReader.hasNextLine()) {
            myReader.nextLine();
            i++;
        }
        myReader.close();
        for (j = 0; j < i; j++) {
            ib = retrieveIssuedBook(myfile, (j));
            issuedBookArrayList.add(ib);
            lbs = retrieveLibraryBookStudent(myfile,(j));
            librarybookedStudentArrayList.add(lbs);

        }
        LocalDate currentDate, nextWeekDate;
        String formattedDate;
        String lineSeparator = System.lineSeparator();
        Scanner obj = new Scanner(System.in);
        switch (ch) {
            case "1": {
                System.out.println("\n\n\n\n");
                Book b = new Book();
                System.out.println("\t\t\t\t\t\t\tEnter Book Name");
                System.out.print("\t\t\t\t\t\t\t");
                b.setName(obj.nextLine());
                while (b.getName().isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Book Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    b.setName(obj.nextLine());
                }
                System.out.println("\t\t\t\t\t\t\tEnter Author Name");
                System.out.print("\t\t\t\t\t\t\t");
                b.setAuthor_name(obj.nextLine());
                while (b.getAuthor_name().isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Author Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    b.setAuthor_name(obj.nextLine());
                }
                System.out.println("\t\t\t\t\t\t\tEnter ISBN");
                System.out.print("\t\t\t\t\t\t\t");
                b.setISBN(obj.nextLine());
                while (b.getISBN().isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the ISBN");
                    System.out.print("\t\t\t\t\t\t\t");
                    b.setISBN(obj.nextLine());
                }
                System.out.println("\t\t\t\t\t\t\tEnter Publisher Name");
                System.out.print("\t\t\t\t\t\t\t");
                b.setPublisher(obj.nextLine());
                while (b.getPublisher().isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Publisher Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    b.setPublisher(obj.nextLine());
                }
                System.out.println("\t\t\t\t\t\t\tEnter Position ");
                System.out.print("\t\t\t\t\t\t\t");
                b.setPosition(obj.nextLine());
                while (b.getPosition().isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Position");
                    System.out.print("\t\t\t\t\t\t\t");
                    b.setPosition(obj.nextLine());
                }
                myfile = new File("books.txt");
                FileWriter myWriter = new FileWriter(myfile,true);
                String sen = b.getName() + "*" + b.getAuthor_name() + "*" + b.getISBN() + "*" + b.getPublisher() + "*" + b.getPosition() + "*false\n";
                myWriter.write(sen);
                myWriter.close();
                b.bookinfo2();
                bookArrayList.add(b);
                Thread.sleep(2000);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                Work2(ch);
                break;
            }
            case "2": {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\tEnter book name to be issued");
                System.out.print("\t\t\t\t\t\t\t");
                String name = obj.nextLine();
                while (name.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Book Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name = (obj.nextLine());
                }
                boolean found = false;
                int flag=0;
                for(i =0;i<bookArrayList.size();i++){
                    if(bookArrayList.get(i).getName().equals(name)){
                        flag=1;
                        IssuedBook issuedBook = new IssuedBook();
                        if(bookArrayList.get(i).isBookIssueStatus()){
                            System.out.println("\n\n\t\t\t\t\t\t\tBook is already issued and is not available right now");
                            break;
                        }
                        bookArrayList.get(i).setBookIssueStatus(true);
                        String fileName = "books.txt";
                        String oldText = "false";
                        String newText = "true";

                        try {
                            File file = new File(fileName);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);

                            StringBuilder sb = new StringBuilder();
                            String line;
                            while ((line = br.readLine()) != null) {
                                if (line.contains(name) && !found) {
                                    line = line.replace(oldText, newText);
                                    found = true;
                                }
                                sb.append(line).append(System.lineSeparator());
                            }

                            fr.close();
                            br.close();

                            String fileContent = sb.toString();

                            FileWriter fw = new FileWriter(file);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(fileContent);

                            bw.close();
                            fw.close();
                        } catch (IOException e) {
                            System.out.print("\n\n\t\t\t\t\t\t\t");
                            System.out.println("An error occurred: " + e.getMessage());
                        }
                        issuedBook.setBook(bookArrayList.get(i));
                        currentDate = LocalDate.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        formattedDate = currentDate.format(formatter);
                        issuedBook.setIssueDate(formattedDate);
                        nextWeekDate = currentDate.plusWeeks(1);
                        formattedDate = nextWeekDate.format(formatter);
                        issuedBook.setDueDate(formattedDate);
                        issuedBook.bookinfo();
                        issuedBookArrayList.add(issuedBook);
                        libraryBookedStudent libraryBookedStudent = new libraryBookedStudent();
                        System.out.println("\t\t\t\t\t\t\tEnter student ID burrowing the Book");
                        System.out.print("\t\t\t\t\t\t\t");
                        libraryBookedStudent.setRoll_number(obj.nextLine());
                        while (libraryBookedStudent.getRoll_number().isEmpty()) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Student ID");
                            System.out.print("\t\t\t\t\t\t\t");
                            libraryBookedStudent.setRoll_number(obj.nextLine());
                        }
                        System.out.println("\t\t\t\t\t\t\tEnter name");
                        System.out.print("\t\t\t\t\t\t\t");
                        libraryBookedStudent.setName(obj.nextLine());
                        while (libraryBookedStudent.getName().isEmpty()) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Student name");
                            System.out.print("\t\t\t\t\t\t\t");
                            libraryBookedStudent.setName(obj.nextLine());
                        }
                        System.out.println("\t\t\t\t\t\t\tEnter department");
                        System.out.print("\t\t\t\t\t\t\t");
                        libraryBookedStudent.setDepartment(obj.nextLine());
                        while (libraryBookedStudent.getDepartment().isEmpty()) {
                            System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Student Department");
                            System.out.print("\t\t\t\t\t\t\t");
                            libraryBookedStudent.setDepartment(obj.nextLine());
                        }
                        libraryBookedStudent.setBook(issuedBook);
                        librarybookedStudentArrayList.add(libraryBookedStudent);
                        libraryBookedStudent.StudentInformation in = libraryBookedStudent.new StudentInformation();
                        myfile = new File("IssuedBooks.txt");
                        FileWriter myWriter = new FileWriter(myfile,true);
                        String sen = issuedBook.book.getName() + "*" + issuedBook.book.getAuthor_name() + "*" + issuedBook.book.getISBN() +
                                "*" + issuedBook.book.getPublisher() + "*" + issuedBook.book.getPosition() + "*" + issuedBook.getIssueDate() +
                                "*" + issuedBook.getDueDate() +  "*" + libraryBookedStudent.getRoll_number() +  "*" + libraryBookedStudent.getName()
                                +  "*" + libraryBookedStudent.getDepartment() + "\n";
                        myWriter.write(sen);
                        myWriter.close();
                        File myFile2 = new File(libraryBookedStudent.getRoll_number()+".txt");
                        FileWriter myWriter2 = new FileWriter(myFile2,true);
                        libraryBookedStudent.returnedBook = false;
                        String sen2 = issuedBook.book.getName() + "*" + issuedBook.book.getAuthor_name() + "*" + issuedBook.book.getISBN() +
                                "*" + issuedBook.book.getPublisher() + "*" + issuedBook.book.getPosition() + "*" + issuedBook.getIssueDate() +
                                "*" + issuedBook.getDueDate() +  "*" + libraryBookedStudent.getRoll_number() +  "*" + libraryBookedStudent.getName()
                                +  "*" + libraryBookedStudent.getDepartment() +  "*" + libraryBookedStudent.getPenalty() +  "*" +
                                libraryBookedStudent.returnedBook + "\n";
                        myWriter2.write(sen2);
                        myWriter2.close();
                        in.Information();
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("\t\t\t\t\t\t\tBook is not available");
                }
                Thread.sleep(3000);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                Work2(ch);
                break;
            }
            case "3": {
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\tEnter book name");
                int flag = 0;
                System.out.print("\t\t\t\t\t\t\t");
                String name1 = obj.nextLine();
                while (name1.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Name");
                    System.out.print("\t\t\t\t\t\t\t");
                    name1 = obj.nextLine();
                }
                for (i=0;i<bookArrayList.size();i++){
                    if(bookArrayList.get(i).getName().equals(name1)){
                        flag=1;
                        System.out.println("\n\n\t\t\t\t\t\t\tPosition : "+bookArrayList.get(i).getPosition());
                    }
                }
                if(flag==0){
                    System.out.println("\n\n\t\t\t\t\t\t\tCopy not available");
                }
                Thread.sleep(2000);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                Work2(ch);
                break;

            }
            case "4": {
                System.out.println("\n\n\n\n");
                boolean found = false;
                System.out.println("\t\t\t\t\t\t\tEnter ISBN number");
                System.out.print("\t\t\t\t\t\t\t");
                String ISBN = obj.nextLine();
                while (ISBN.isEmpty()) {
                    System.out.println("\n\n\t\t\t\t\t\t\tPlease ENTER the Student ID");
                    System.out.print("\t\t\t\t\t\t\t");
                    ISBN = obj.nextLine();
                }
                currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                formattedDate = currentDate.format(formatter);
                for(i=0;i<bookArrayList.size();i++){
                    if(bookArrayList.get(i).getISBN().equals(ISBN)){
                        bookArrayList.get(i).setBookIssueStatus(false);
                    }
                }
                int compare = 0;
                for(i=0;i<issuedBookArrayList.size();i++){
                    IssuedBook issuedBook = issuedBookArrayList.get(i);
                    libraryBookedStudent librarybookedStudent = librarybookedStudentArrayList.get(i);
                    if (issuedBook.getBook().getISBN().equals(ISBN)) {
                        if(compare>issuedBook.getDueDate().compareTo(formattedDate)){
                            System.out.println("\t\t\t\t\t\t\tPenalty of Rs.350 is applied due to late submission");
                            librarybookedStudent.setPenalty(350);
                            String fileName = librarybookedStudent.getRoll_number() + ".txt";
                            String oldText = "0.0";
                            String newText = "350";
                            try {
                                File file = new File(fileName);
                                FileReader fr = new FileReader(file);
                                BufferedReader br = new BufferedReader(fr);

                                StringBuilder sb = new StringBuilder();
                                String line;
                                while ((line = br.readLine()) != null) {
                                    if (line.contains(ISBN) && !found) {
                                        line = line.replace(oldText, newText);
                                        found = true;
                                    }
                                    sb.append(line).append(System.lineSeparator());
                                }

                                fr.close();
                                br.close();

                                String fileContent = sb.toString();

                                FileWriter fw = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write(fileContent);

                                bw.close();
                                fw.close();
                            } catch (IOException e) {
                                System.out.print("\n\n\t\t\t\t\t\t\t");
                                System.out.println("An error occurred: " + e.getMessage());
                            }

                        }

                        File file = new File("IssuedBooks.txt");
                        String lineToRemove = issuedBook.book.getName() + "*" + issuedBook.book.getAuthor_name() + "*" + issuedBook.book.getISBN() +
                                "*" + issuedBook.book.getPublisher() + "*" + issuedBook.book.getPosition() + "*" + issuedBook.getIssueDate() +
                                "*" + issuedBook.getDueDate() +  "*" + librarybookedStudent.getRoll_number() +  "*" + librarybookedStudent.getName()
                                +  "*" + librarybookedStudent.getDepartment();
                        String tempFileName = "temp.txt";

                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

                            StringBuilder stringBuilder = new StringBuilder();
                            String currentLine;
                            while ((currentLine = bufferedReader.readLine()) != null) {
                                if (!currentLine.equals(lineToRemove)) {
                                    stringBuilder.append(currentLine).append(System.lineSeparator());
                                }
                            }

                            bufferedReader.close();

                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                            bufferedWriter.write(stringBuilder.toString());
                            bufferedWriter.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        issuedBookArrayList.remove(i);
                        librarybookedStudent.returnedBook=true;
                        found = false;
                        String fileName = librarybookedStudent.getRoll_number() + ".txt";
                        String oldText = "false";
                        String newText = "true";
                        try {
                            file = new File(fileName);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);

                            StringBuilder sb = new StringBuilder();
                            String line;
                            while ((line = br.readLine()) != null) {
                                if (line.contains(ISBN) && !found) {
                                    line = line.replace(oldText, newText);
                                    found = true;
                                }
                                sb.append(line).append(System.lineSeparator());
                            }

                            fr.close();
                            br.close();

                            String fileContent = sb.toString();

                            FileWriter fw = new FileWriter(file);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(fileContent);

                            bw.close();
                            fw.close();
                        } catch (IOException e) {
                            System.out.print("\n\n\t\t\t\t\t\t\t");
                            System.out.println("An error occurred: " + e.getMessage());
                        }
                        fileName = "books.txt";
                        oldText = "true";
                        newText = "false";
                        found = false;
                        try {
                            file = new File(fileName);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);

                            StringBuilder sb = new StringBuilder();
                            String line;
                            while ((line = br.readLine()) != null) {
                                if (line.contains(ISBN) && !found) {
                                    line = line.replace(oldText, newText);
                                    found = true;
                                }
                                sb.append(line).append(System.lineSeparator());
                            }

                            fr.close();
                            br.close();

                            String fileContent = sb.toString();

                            FileWriter fw = new FileWriter(file);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(fileContent);

                            bw.close();
                            fw.close();
                        } catch (IOException e) {
                            System.out.print("\n\n\t\t\t\t\t\t\t");
                            System.out.println("An error occurred: " + e.getMessage());
                        }
                    }
                }
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\tBook with ISBN "+ISBN+" is returned to library");
                Thread.sleep(2000);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                Work2(ch);
                break;
            }
            case "5": {
                break;
            }
            default: {
                System.out.println("\n\n\n\n\t\t\t\t\t\t\t\tIn-Valid Choice.\n\t\t\t\t\t\t\tPlease choose correct choice");
                Thread.sleep(2000);
                Work();
                System.out.print("\t\t\t\t\t\t\t");
                ch = obj.nextLine();
                Work2(ch);
            }
        }
    }

    private static Book retrieveBook(File myfile, int line) throws FileNotFoundException {
        Scanner myReader = new Scanner(myfile);
        String sen = myReader.nextLine();
        Book b1 = new Book();
        int i, j,k;
        for (i = 0; i < line; i++) {
            sen = myReader.nextLine();
        }
        j = 0;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring = sen.substring(0, j);
        b1.setName(substring);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        String substring2 = sen.substring(j, k);
        b1.setAuthor_name(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring1 = sen.substring(k, j);
        b1.setISBN(substring1);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        substring2 = sen.substring(j, k);
        b1.setPublisher(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        substring1 = sen.substring(k, j);
        b1.setPosition(substring1);
        j++;
        substring2 = sen.substring(j);
        b1.setBookIssueStatus(Boolean.parseBoolean(substring2));
        return b1;
    }
    private static IssuedBook retrieveIssuedBook(File myfile, int line) throws FileNotFoundException {
        Scanner myReader = new Scanner(myfile);
        String sen = myReader.nextLine();
        Book b1 = new Book();
        IssuedBook issuedBook = new IssuedBook();
        int i, j,k;
        for (i = 0; i < line; i++) {
            sen = myReader.nextLine();
        }
        j = 0;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring = sen.substring(0, j);
        b1.setName(substring);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        String substring2 = sen.substring(j, k);
        b1.setAuthor_name(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring1 = sen.substring(k, j);
        b1.setISBN(substring1);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        substring2 = sen.substring(j, k);
        b1.setPublisher(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        substring1 = sen.substring(k, j);
        b1.setPosition(substring1);
        j++;
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        substring2 = sen.substring(j, k);
        issuedBook.setIssueDate(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        substring1 = sen.substring(k, j);
        issuedBook.setDueDate(substring1);
        issuedBook.setBook(b1);
        return issuedBook;
    }
    private static libraryBookedStudent retrieveLibraryBookStudent(File myfile, int line) throws FileNotFoundException {
        Scanner myReader = new Scanner(myfile);
        String sen = myReader.nextLine();
        libraryBookedStudent libraryBookedStudent = new libraryBookedStudent();
        int i, j,k;
        for (i = 0; i < line; i++) {
            sen = myReader.nextLine();
        }
        j = 0;
        for (k = 0; k < 7; k++) {
            while (CHAR != sen.charAt(j)) {
                j++;
            }
            j++;
        }
        k = j;
        while (CHAR != sen.charAt(k)) {
            k++;
        }
        String substring2 = sen.substring(j, k);
        libraryBookedStudent.setRoll_number(substring2);
        k++;
        j = k;
        while (CHAR != sen.charAt(j)) {
            j++;
        }
        String substring1 = sen.substring(k, j);
        libraryBookedStudent.setName(substring1);
        j++;
        substring2 = sen.substring(j);
        libraryBookedStudent.setDepartment(substring2);
        return libraryBookedStudent;
    }
}
interface BookInformation{
    void bookinfo();
}

class Book implements BookInformation{
    private String position;
    private boolean BookIssueStatus;
    private static int quantity;
    private String name;
    private String ISBN;
    private String publisher;
    private String author_name;
    public Book(){}
    public Book(String name, String ISBN, String publisher,String author_name,String position,boolean BookIssueStatus) {
        this.name = name;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.author_name = author_name;
        this.position = position;
        this.BookIssueStatus = BookIssueStatus;
        quantity++;
    }

    public boolean isBookIssueStatus() {
        return BookIssueStatus;
    }

    public void setBookIssueStatus(boolean bookIssueStatus) {
        BookIssueStatus = bookIssueStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Book.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor_name() {
        return author_name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    @Override
    public void bookinfo() {
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t\t\t\t\tBook name : "+getName());
        System.out.println("\t\t\t\t\t\t\tBook author : "+getAuthor_name());
        System.out.println("\t\t\t\t\t\t\tBook position : "+getPosition());
        System.out.println("\t\t\t\t\t\t\tBook issued status : "+isBookIssueStatus());
        System.out.println("\t\t\t\t\t\t\tBook publisher : "+getPublisher());
        System.out.println("\t\t\t\t\t\t\tBook ISBN : "+getISBN());
    }
    public void bookinfo2() {
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t\t\t\t\tBook name : "+getName());
        System.out.println("\t\t\t\t\t\t\tBook author : "+getAuthor_name());
        System.out.println("\t\t\t\t\t\t\tBook position : "+getPosition());
        System.out.println("\t\t\t\t\t\t\tBook publisher : "+getPublisher());
        System.out.println("\t\t\t\t\t\t\tBook ISBN : "+getISBN());
    }
}
class IssuedBook implements BookInformation{
    Book book;
    private String issueDate;
    private String DueDate;

    public IssuedBook(){}
    public IssuedBook(Book book, String issueDate, String dueDate) {
        this.book = book;
        this.issueDate = issueDate;
        DueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    @Override
    public void bookinfo() {
        book.bookinfo();
        System.out.println("\t\t\t\t\t\t\tIssue date : "+getIssueDate());
        System.out.println("\t\t\t\t\t\t\tDue Date : "+getDueDate());
    }
}
class Student{
    private String Roll_number;
    private String name;
    public Student(){}
    public Student(String roll_number, String name) {
        Roll_number = roll_number;
        this.name = name;
    }

    public String getRoll_number() {
        return Roll_number;
    }

    public String getName() {
        return name;
    }

    public void setRoll_number(String roll_number) {
        Roll_number = roll_number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class libraryBookedStudent extends Student{
    private String department;
    IssuedBook book;
    private double penalty;
    boolean returnedBook;
    public libraryBookedStudent(){
        super();
    }
    public libraryBookedStudent(String roll_number, boolean returnedBook,String name, String department, IssuedBook book) {
        super(roll_number, name);
        this.department = department;
        this.book = book;
        this.returnedBook = returnedBook;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public String getDepartment() {
        return department;
    }

    public IssuedBook getBook() {
        return book;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBook(IssuedBook book) {
        this.book = book;
    }

    class StudentInformation{
        void Information(){
            System.out.println("\n\n\n\n");
            System.out.println("\t\t\t\t\t\t\tStudent ID : "+ getRoll_number());
            System.out.println("\t\t\t\t\t\t\tStudent name : "+ getName());
            System.out.println("\t\t\t\t\t\t\tStudent department : "+department);
            System.out.println("\t\t\t\t\t\t\tStudent burrowed book : "+book.book.getName()+", ISBN : "+book.book.getISBN());
        }
    }
}
enum PasswordApp {
    ;

    public static void main(String[] argv) {
        char[] password = null;
        try {
            password = PasswordField.getPassword("Enter your password: ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (null == password) {
            System.out.println("No password entered");
        } else {
            String valueOf = String.valueOf(password);
            System.out.println("The password entered is: " + valueOf);
        }
    }
}

enum PasswordField {
    ;
    private static final int INT = 128;
    private static final char VAL = ' ';
    private static final char CHAR = '\n';
    private static final char CHAR1 = '\r';

    static char[] getPassword(String prompt) throws IOException {
        InputStream inputStream = System.in;
        MaskingThread maskingthread = new MaskingThread(prompt);
        Thread thread = new Thread(maskingthread);
        thread.start();

        char[] lineBuffer;
        char[] buf;
        buf = lineBuffer = new char[INT];
        int room = buf.length;
        int offset = 0;
        int c;
        loop:
        while (true) {
            switch (c = inputStream.read()) {
                case -1:
                case CHAR:
                    break loop;
                case CHAR1:
                    int c2 = inputStream.read();
                    if ((CHAR != c2) && (-1 != c2)) {
                        if (!(inputStream instanceof PushbackInputStream)) {
                            inputStream = new PushbackInputStream(inputStream);
                        }
                        ((PushbackInputStream) inputStream).unread(c2);
                    } else {
                        break loop;
                    }
                default:
                    --room;
                    if (0 > room) {
                        buf = new char[offset + INT];
                        room = buf.length - offset - 1;
                        System.arraycopy(lineBuffer, 0, buf, 0, offset);
                        Arrays.fill(lineBuffer, VAL);
                        lineBuffer = buf;
                    }
                    buf[offset] = (char) c;
                    offset++;
                    break;
            }
        }
        maskingthread.stopMasking();
        if (0 == offset) {
            return null;
        }
        char[] ret = new char[offset];
        System.arraycopy(buf, 0, ret, 0, offset);
        Arrays.fill(buf, VAL);
        return ret;
    }
}

class MaskingThread extends Thread {
    private static final char ECHO_CHAR = '*';
    private static final char CHAR = '}';
    private volatile boolean stop;

    MaskingThread(String prompt) {
        System.out.print(prompt);
    }

    public void run() {
        int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        try {
            this.stop = true;
            while (this.stop) {
                System.out.print("\010" + ECHO_CHAR);
                try {
                    sleep(1);
                } catch (InterruptedException iex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } finally {
            Thread.currentThread().setPriority(priority);
        }
    }

    void stopMasking() {
        this.stop = false;
    }

    @Override
    public String toString() {
        return "MaskingThread{" +
                "stop=" + this.stop +
                CHAR;
    }
}