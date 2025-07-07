import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej svoje jmeno:");
        String my_name =  scanner.nextLine();
        System.out.println("Jmenujes se:" + my_name);

        System.out.println("Zadej svuj vek:");
        int my_age =  scanner.nextInt();
        System.out.println("Je ti:" + my_age+"let.");
    }
    }
