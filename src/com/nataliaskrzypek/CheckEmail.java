
import java.util.Scanner;

public class CheckEmail {


    public static void main(String[] args) {

        // Initialize scanner object, read the value
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = odczyt.next();

        // Checking if email ends with '.' (kropka)
        boolean checkEndDot  = false;
        checkEndDot = email.endsWith(".");

        // Finding out last index of '@' sign
        int indexOfAt = email.indexOf('@');
        int lastIndexOfDot = email.lastIndexOf('.');


        //Code to check occurence of @ in the email address
        // int dlugosc = email.length()
        int ileMalp = 0;

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@')
                ileMalp++; }


        // Checking occurence of "." after @ --> same as domainName
        String domenaPierwsza = email.substring(email.indexOf('@')+1, email.length());
        int len = domenaPierwsza.length(); //to jest długość domeny


        int countOfDotAfterAt = 0;
        for (int i=0; i < len; i++) {
            if(domenaPierwsza.charAt(i)=='.')
                countOfDotAfterAt++; }


// Code to print userName & domainName
        String userName = email.substring(0, email.indexOf('@'));
        String domainName = email.substring(email.indexOf('@')+1, email.length());

        System.out.println("\n");

        if ((ileMalp==1) && (userName.endsWith(".")==false)  && (countOfDotAfterAt ==1) &&
                ((indexOfAt+3) <= (lastIndexOfDot) && !checkEndDot)) {

            System.out.println("\"Valid email address\"");}

        else {
            System.out.println("\n\"Invalid email address\""); }


        System.out.println("\n");
        System.out.println("User name: " +userName+ "\n" + "Domain name: " +domainName);


    }}

