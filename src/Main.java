import java.util.Random;

public class Main {

    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();
        customArray.add(5);
        customArray.add(5);
        customArray.add(5);
        customArray.add(5);
        customArray.add(5);
        customArray.add(5);
        customArray.add(5);
        System.out.println(customArray);
        customArray.add(7,3);
        System.out.println(customArray);

        customArray.remove(3);
        System.out.println(customArray);

        for(int i=0;i<customArray.getSize();i++){
            System.out.print(customArray.get(i)+" ,");
        }
        //Random random = new Random();

//        for (int i = 0; i < 4; i++) {
//            customArray.add(random.nextInt(100)); // Добавляем случайные числа от 0 до 99
//        }
//        System.out.println("Original Array: " + customArray);
//
//        int insertIndex = random.nextInt(customArray.getSize() > 0 ? customArray.getSize() : 1); // Исправление тут
//        int insertValue = random.nextInt(100); // Новое случайное значение для вставки
//        customArray.addValueAtIndex(insertValue, insertIndex);
//        System.out.println("Array after insertion: " + customArray);
//
//        int removeIndex = random.nextInt(customArray.getSize()); // Выбираем случайный индекс для удаления
//        customArray.remove(removeIndex);
//        System.out.println("Array after removal: " + customArray);
//
//        int editIndex = random.nextInt(customArray.getSize()); // Выбираем случайный индекс для редактирования
//        int editValue = random.nextInt(100); // Новое случайное значение для редактирования
//        customArray.edit(editIndex, editValue);
//        System.out.println("Array after editing: " + customArray);
//    customArray.removeAll();
//        System.out.println(customArray);
    }
}
