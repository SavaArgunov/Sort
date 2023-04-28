import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static ArrayList<Computer> Computers = new ArrayList<Computer>();
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Computer comp1 = new Computer(20000,3,1050);
        Computer comp2 = new Computer(120000,9,2060);
        Computer comp3 = new Computer(50000,5,3050);
        Computer comp4 = new Computer(70000,7,3090);
        Computer comp5 = new Computer(150000,9,4090);
        Computers.add(comp1);
        Computers.add(comp2);
        Computers.add(comp3);
        Computers.add(comp4);
        Computers.add(comp5);
        menu();
    }
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        int act = 0;
        System.out.println("==========================");
        System.out.println("1 - Информация про класс");
        System.out.println("2 - Сортировка");
        System.out.println("==========================");
        act = scanner.nextInt();
        if(act == 1)
            info();
        else sort();
    }
    public static void info()
    {
        int act = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Класс Computer содержит такие параметры:Цена,серия процессора,серия видеокарты.");
        System.out.println("Что-бы вернутся напиште 1");
        act = scanner.nextInt();
        if(act != 1)
        {
            System.out.println("НЕ хитрить!!");
            menu();
        }
        else menu();

    }
    public static void sort()
    {
        Scanner scanner = new Scanner(System.in);
        int act = 0;
        System.out.println("==========================");
        System.out.println("1 - Сортировка по цене");
        System.out.println("2 - Сортировка по серии процессора");
        System.out.println("3 - Сортировка по серии видео карты");
        System.out.println("==========================");
        act = scanner.nextInt();
        switch (act)
        {
            case 1 -> sortByCost();
            case 2 -> sortByCPU();
            case 3 -> sortByGPU();
        }
    }
    public static void sortByCost()
    {
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < Computers.size() - 1; i++) {
                if (Computers.get(i).cost > Computers.get(i + 1).cost) {
                    isSorted = false;
                    Computer helper = Computers.get(i);
                    Computers.set(i, Computers.get(i + 1));
                    Computers.set(i + 1, helper);
                } else isSorted = true;
            }
        }
        for(Computer c : Computers)
        {
            System.out.println("Серия процессора: " + c.CPUserie);
            System.out.println("Серия видеокарты: " + c.GPUserie);
            System.out.println("Цена: " + c.cost);
        }

    }
    public static void sortByCPU()
    {
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < Computers.size() - 1; i++) {
                if (Computers.get(i).CPUserie > Computers.get(i + 1).CPUserie) {
                    isSorted = false;
                    Computer helper = Computers.get(i);
                    Computers.set(i, Computers.get(i + 1));
                    Computers.set(i + 1, helper);
                } else isSorted = true;
            }
        }
        for(Computer c : Computers)
        {
            System.out.println("Серия процессора: " + c.CPUserie);
            System.out.println("Серия видеокарты: " + c.GPUserie);
            System.out.println("Цена: " + c.cost);
        }
    }
    public static void sortByGPU()
    {
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < Computers.size() - 1; i++) {
                if (Computers.get(i).GPUserie > Computers.get(i + 1).GPUserie) {
                    isSorted = false;
                    Computer helper = Computers.get(i);
                    Computers.set(i, Computers.get(i + 1));
                    Computers.set(i + 1, helper);
                } else isSorted = true;
            }
        }
        for(Computer c : Computers)
        {
            System.out.println("Серия процессора: " + c.CPUserie);
            System.out.println("Серия видеокарты: " + c.GPUserie);
            System.out.println("Цена: " + c.cost);
        }
    }
}

