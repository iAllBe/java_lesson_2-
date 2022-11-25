import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        // 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат
        // после каждой итерации запишите в лог-файл.
        int[] mas = { 11, 3, 14, 16, 7 };
        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("log.txt", true);

                fileOutputStream.write(Arrays.toString(mas).getBytes());

                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Проблема вывода!");
                e.printStackTrace();
            }

            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
