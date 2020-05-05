import java.util.HashMap;
import java.util.Scanner;

public class ElizaApp {
    public static void main(String[] args) {
        /*
            replace i with you
            replace me with you
            replace my with your
            replace am with are
        */
        Scanner scanner= new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Good day. What is your problem?");
        System.out.println("Enter your response here or Q to quit:");
        String cont= scanner.nextLine();
        while(!(cont.equalsIgnoreCase("q"))) {
            String []change = cont.split(" ");
            for (int i = 0; i < change.length ; i++) {
                if(change[i].equalsIgnoreCase("i")){
                    change[i] = "you";
                }
                else if(change[i].equalsIgnoreCase("me"))
                    change[i] = "you";
                else if(change[i].equalsIgnoreCase("my")) {
                    change[i] = "your";
                }
                else if(change[i].equalsIgnoreCase("am")){
                    change[i] = "are";
                }
            }

            for (int i = 0; i <change.length ; i++) {
                System.out.print(change[i] + " ");
            }
            System.out.println();
            System.out.println("Enter your response here or Q to quit:");
            cont = scanner.nextLine();
        }
    }
}


