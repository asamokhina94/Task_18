import java.io.*;

public class Task_18 {
    public static void main(String[] args) {
        String read;
        String write;
        int count = 0;    //для подсчёта строк в файле
        int count1 = 0;
        try (BufferedReader st = new BufferedReader(new FileReader("test.txt"))) {
            while ((read = st.readLine()) != null) {       //Цикл для чтения всех строк в файле
                count++;         //Подсчёт строк в файле
                System.out.println(read);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      //Запись в файл
        try (FileWriter fw = new FileWriter("test.txt")) {
            System.out.println("Наберите текст для записи в файл и нажмите Enter");
            do {
                System.out.print(": ");
                write = br.readLine();
                write = write + "\r\n";
                count1++;      //Подсчёт введённых строк
                fw.write(write);
            }
            while (count1 < count); //Выполняется до тех пор, пока кол-во введённых строк меньше кол-ва строк в изначальном файле
        }
        catch (IOException exc1) {
            System.out.println("Ошибка ввода-вывода: " + exc1);
        }
    }
}
