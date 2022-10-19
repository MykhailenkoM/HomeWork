package abstractHandler;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкритий файл формату .txt");
    }

    @Override
    void create() {
        System.out.println("Створений файл формату .txt");
    }

    @Override
    void change() {
        System.out.println("Змінений файл формату .txt");
    }

    @Override
    void save() {
        System.out.println("Збережений файл формату .txt");
    }
}
