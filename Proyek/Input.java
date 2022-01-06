
import java.io.Console;
import java.util.*;

public class Input {

    public String String(String text){
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String data = scan.nextLine();
        return data;
    }

    public int Int(String text){
        Scanner scan = new Scanner(System.in);
        boolean lanjutInputInt = true;
        int data = 0;
        do {
            try{
                System.out.print(text);
                data = scan.nextInt();
                lanjutInputInt = false;
            }

            catch(InputMismatchException ex){
                System.out.print("         [ Coba lagi ] === ");
                System.out.println("(Input invalid: Gunakan Angka sebagai masukan)");
                System.out.println();
                scan.nextLine();
            }
        } while (lanjutInputInt);
        return data;
    }

    public double Double (String text){
        Scanner scan = new Scanner(System.in);
        boolean lanjutInputIpk = true;
        double data = 0;
        do {
            try{
                System.out.print(text);
                data = scan.nextDouble();
                lanjutInputIpk = false;
            }

            catch(InputMismatchException ex){
                
                System.out.print("      [ Coba lagi ] === ");
                System.out.println("(Input invalid: Gunakan titik(.) untuk angka desimal)");
                System.out.println();
                scan.nextLine();
            }
        } while (lanjutInputIpk);
        return data;
    }

    public String Pass(String text){
        Console console = System.console();
        char[] passwd = console.readPassword(text);
        String pass = String.valueOf(passwd);
        return pass;
    }
}
