
import java.io.*;
import java.io.FileInputStream;

/* 
Минимальный байт

Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int min =2147483647,i;
        while(inputStream.available()>0)
            if((i=inputStream.read())< min)
                min = i;
        inputStream.close();
        System.out.println(min);
    }
}
