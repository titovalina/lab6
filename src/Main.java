/**
 * Главный класс программы — демонстрация обработки аннотаций.
 */
public class Main {

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        InvokeClass demo = new InvokeClass();
        InvokeProcessor.process(demo);

        System.out.println("\n=== Задание 2 ===");
        DefaultProcessor.process(ExampleDefaultClass.class);

        System.out.println("\n=== Задание 3 ===");
        Person p = new Person();
        System.out.println(ToStringProcessor.buildString(p));

        System.out.println("\n=== Задание 4 ===");
        ValidateProcessor.process(ExampleValidateClass.class);

        System.out.println("\n=== Задание 5 ===");
        TwoProcessor.process(TwoExample.class);

        System.out.println("\n=== Задание 6 ===");
        CacheProcessor.process(CacheExample.class);
    }
}