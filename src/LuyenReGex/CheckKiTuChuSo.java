package LuyenReGex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckKiTuChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập 5-10 kí tự bao gồm cả chữ và số :");
            String nhap = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{5,10}$");
                if (pattern.matcher(nhap).find()){
                    System.out.println("Chuẩn chuẩn ");
                    break;
                }else {
                    System.err.println("Khoan khoan , Dừng khoảng chừng là 2s");
                }
        }
    }
}
