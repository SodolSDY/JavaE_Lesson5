package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Слон");
        arrayList.add("Медведь");
        arrayList.add("Змея");
        arrayList.add("Волк");
        arrayList.add("Лисица");
        arrayList.add("Лев");
        arrayList.add("Тигр");
        arrayList.add("Обезьяна");
        System.out.println(arrayList);
        System.out.println("-----------------");

        arrayList.remove("Змея");
        arrayList.remove("Лисица");
        arrayList.remove("Тигр");
        System.out.println(arrayList.size());
        System.out.println(arrayList);

    }
}
