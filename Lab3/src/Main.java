import java.util.Scanner;
public class Main {

    public static int fibinacci(int index){
        if(index < 3){
            return 1;
        }
        else{
            return fibinacci(index-1) + fibinacci(index-2);
        }
    }

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Input the fibinacci index: ");
        int index = m.nextInt();
        System.out.println("The fibinacci number at that index is: " + fibinacci(index));
    }
}