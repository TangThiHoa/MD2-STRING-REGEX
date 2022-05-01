package LuyenReGex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckSdtChinhXac10so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Input phone : ");
            String phone = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]{10}$");
            if (p.matcher(phone).find()){
                System.out.println("Phone ok");
                break;
            }else {
                System.err.println("Phone không ok ");
            }

        }

    }
}
