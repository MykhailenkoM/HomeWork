package abstractHandler;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкритий файл формату .doc");
    }

    @Override
    void create() {
        System.out.println("Створений файл формату .doc");
    }

    @Override
    void change() {
        System.out.println("Змінений файл формату .doc");
    }

    @Override
    void save() {
        System.out.println("Збережений файл формату .doc");
    }


}
