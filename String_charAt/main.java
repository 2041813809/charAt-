package String_charAt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String line = ac.nextLine();

        for (int i = 1;i<line.length();i++)
        System.out.println(line.charAt(i));
        //charAt 用于打印字符串中的字符
    }
}
