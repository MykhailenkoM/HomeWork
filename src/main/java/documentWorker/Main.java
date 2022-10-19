package documentWorker;

import java.util.Scanner;

public class Main {
    public static final String Key_pro = "1111";
    public static final  String Key_expert = "2222";
    public static Scanner sc = new Scanner(System.in);

    public static void document(DocumentWorker documentWorker) {
        System.out.println(documentWorker);
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }

     public static void validateKey() {
         String enter_key = sc.next();
         switch (enter_key) {
             case Key_pro:
                 ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                 document(proDocumentWorker);
                 break;
             case Key_expert:
                 ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                 document(expertDocumentWorker);
                 break;
             default:
                 System.out.println("Ключ не корректний");
                 DocumentWorker documentWorker = new DocumentWorker();
                 document(documentWorker);
                 break;
         }
     }

    public static void main(String[] args) {
         System.out.println("Чи є у Вас ключ від розширенних версій (yes/no)");
         String have = sc.next();
         switch (have) {
             case "yes":
                 System.out.println("Введіть Ваш ключ:");
                 validateKey();
                 break;
             case "no":
                 DocumentWorker documentWorker = new DocumentWorker();
                 document(documentWorker);
                 break;
             default:
                 System.out.println("Сталася якась помилка, або невірний ключ програми");
         }
     }
}
