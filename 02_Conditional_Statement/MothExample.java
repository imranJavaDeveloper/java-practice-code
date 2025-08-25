package Switch;

import java.util.Scanner;
public class MothExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter moth Name");
        String mothName=sc.nextLine();

        switch (mothName){

            case "January":
                System.out.println("Print Jan is First Month");
                break;

            case "febuary":
                System.out.println("Print feb is second Month");
                break;

            case "march":
                System.out.println("Print march is third Month");
                break;

            default:
                System.out.println("Worng input");
                break;
        }
        }

    }

