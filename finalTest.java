import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */

//  Задание выполнил Михаил Бовшин

public class finalTest {

    public static void main(String[] args) {
        Set<NoteBook> set = createNotebookSet();
        System.out.println("Welcome! This programm has a set of notebooks, and you can filter them by one of their properties.\n");
        initialSotr(set);
    }

    static Set<NoteBook> createNotebookSet () {
        NoteBook notebook1 = new NoteBook("LenovoA20", 8, 512, "Windows", "white");
        NoteBook notebook2 = new NoteBook("AsusB10", 4, 512, "Linux", "white");
        NoteBook notebook3 = new NoteBook("AsusRT50", 8, 2048, "Windows", "black");
        NoteBook notebook4 = new NoteBook("LenovoET46", 16, 1024, "Windows", "black");
        NoteBook notebook5 = new NoteBook("LenovoYS32", 8, 1024, "Linux", "red");
        Set<NoteBook> set = new HashSet<>();
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        return set;
    }

    static void initialSotr (Set<NoteBook> set) {
        System.out.println("Choose a parameter to sort notebooks by: \n1 for memory \n2 for HD \n3 for OS \n4 for color");
        Scanner sc = new Scanner(System.in);
        int parameter = sc.nextInt();
        switch (parameter) {
            case 1:
                sortByMemory(set);
                break;
            case 2:
                sortByHD(set);
                break;
            case 3:
                sortByOS(set);
                break;
            case 4:
                sortByColor(set);
                break;
            default:
                System.out.println("You chose an incorrect number");
                break;
        }
        sc.close();
    }

    static void sortByMemory (Set<NoteBook> set) {
        System.out.println("This programm will show notebooks, that have memory within requested range\nEnter the minimum memory value (GB):");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println("Now enter the maximum memory value (GB):");
        int max = sc.nextInt();
        for (NoteBook item : set) {
            if (item.getMemory() >= min & item.getMemory() <= max) System.out.println(item);
        }
        sc.close();
    }

    static void sortByHD (Set<NoteBook> set) {
        System.out.println("This programm will show notebooks, that have HD within requested range\nEnter the minimum HD value (GB):");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println("Now enter the maximum HD value (GB):");
        int max = sc.nextInt();
        for (NoteBook item : set) {
            if (item.getHd() >= min & item.getHd() <= max) System.out.println(item);
        }
        sc.close();
    }
    
    static void sortByColor (Set<NoteBook> set) {
        System.out.println("Choose a color of notebooks to sort by: \n1 for white \n2 for black \n3 for red");
        Scanner sc = new Scanner(System.in);
        int parameter = sc.nextInt();
        switch (parameter) {
            case 1:
                for (NoteBook item : set) {
                    if (item.getColor()=="white") System.out.println(item);
                }
                break;
            case 2:
            for (NoteBook item : set) {
                if (item.getColor()=="black") System.out.println(item);
            }
                break;
            case 3:
            for (NoteBook item : set) {
                if (item.getColor()=="red") System.out.println(item);
            }
                break;
            default:
                System.out.println("You chose an incorrect number");
                break;
        }
        sc.close();
    }

    static void sortByOS (Set<NoteBook> set) {
        System.out.println("Choose an OS of notebooks to sort by: \n1 for Windows \n2 for Linux");
        Scanner sc = new Scanner(System.in);
        int parameter = sc.nextInt();
        switch (parameter) {
            case 1:
                for (NoteBook item : set) {
                    if (item.getOs()=="Windows") System.out.println(item);
                }
                break;
            case 2:
            for (NoteBook item : set) {
                if (item.getOs()=="Linux") System.out.println(item);
            }
                break;
            default:
                System.out.println("You chose an incorrect number");
                break;
        }
        sc.close();
    }

}