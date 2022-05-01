package LuyenReGex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckChuoiChinhXac6KiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập đúng 6 ký tự : ");
            String sau = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]{6}$");
            if(pattern.matcher(sau).find()){
                System.out.println("Chuẩn chuẩn ");
                break;
            }else {
                System.err.println("Dừng khoảng chừng là 2s");
            }
        }
    }
}
