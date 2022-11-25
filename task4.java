import java.util.Scanner;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class task4 {
    public static void main(String[] args) {
        // 4*. К калькулятору из предыдущего дз добавить логирование.

        Logger logger = LoggerFactory.getLogger(task4.class);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = Integer.parseInt(scan.next());
        System.out.println("Введите второе число");
        int secondNumber = Integer.parseInt(scan.next());
        System.out.println("Введите операцию");
        String operation = scan.next();
        scan.close();

        try {
            if (operation.equals("+")) {
                System.out.print("Результат: ");
                System.out.println(firstNumber + secondNumber);
            } else if (operation.equals("-")) {
                System.out.print("Результат: ");
                System.out.println(firstNumber - secondNumber);
            } else if (operation.equals("*")) {
                System.out.print("Результат: ");
                System.out.println(firstNumber * secondNumber);
            } else if (operation.equals("/")) {
                System.out.print("Результат: ");
                System.out.println(firstNumber / secondNumber);
            }
        } catch (Exception e) {
            logger.error("На ноль делить нельзя!");
        }
        
    }}
