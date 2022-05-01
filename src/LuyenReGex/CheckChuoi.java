package LuyenReGex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chỉ nhận 1 số :
        // Nhập nhiều số : thêm dấu cộng        : "^[0-9]+$"
        // Nhập số > 6 kí tự                    :"^[0-9]{6,}+$"
        // Nhập  chính xác 6 ký tự              : "^[0-9]{6}+$"
        // Nhập trong khoảng bao nhiêu ký tự    :"^[0-9]{6,10}+$"
        // Nhập từ aA đến zZ                    : "^[a-zA-Z]+$"
        // Nhập cả chữ và số                    :"^[a-zA-Z0-9]+$"
        // Nhập có dấu cách                     :"^[a-zA-Z0-9 ]+$"


        Pattern pattern= Pattern.compile("^[a-zA-Z0-9 ]+$"); // Bắt đầu ^ , kết thúc $
        while (true){
            System.out.println("Input txt : ");
            String txt = sc.nextLine();
            if (pattern.matcher(txt).find()){
                System.out.println("OK");
                break;
            }else {
                System.out.println("Không ổn ");

            }
        }

    }
}
