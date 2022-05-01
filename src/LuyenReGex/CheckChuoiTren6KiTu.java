package LuyenReGex;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckChuoiTren6KiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập chữ trên 6 ký tự :");
            String chu = sc.nextLine();;
            Pattern p = Pattern.compile("^[0-9]{6}+$");
            if(p.matcher(chu).find()){
                System.out.println("Chuẩn chuẩn ");
            }else {
                System.err.println("Dừng khoảng chừng là 5s");
            }
        }
    }
}
