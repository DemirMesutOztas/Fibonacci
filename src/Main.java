import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Sayı giriniz: ");

        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        int num1=0;
        int num2=1;
        boolean status=true;
        int result=0;

        while(counter>1)
        {
            if(status)
            {
                System.out.print(num1+" "+num2+" ");
                status=false;

            }
            else
            {
                result=num1+num2;
                num1=num2;
                num2=result;
                System.out.print(result+" ");
                counter--;
            }

        }
    }
}