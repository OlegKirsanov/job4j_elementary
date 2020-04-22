package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key) {
                rsl = index;
                break;
            }
        }
        if(rsl == -1) throw new ElementNotFoundException("Oops, no such element found!");
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"test1", "test2"};
        try{
            int rsl = indexOf(array, "test5");
        } catch(ElementNotFoundException error) {
            error.printStackTrace();
        }
    }
}





/*  Допишите метод поиска индекса элемента в строковом массиве.
    Если элемента нет, то нужно выкинуть исключение ElementNotFoundException. В сингатуре метода объявить это исключение.
    Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch. */
