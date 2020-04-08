package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item, String name) {
        item.setId(generateId());
        item.setName(name);
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] tmp = new Item[position];
        int tmpIndex = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                tmp[tmpIndex++] = items[index];
            }
        }
        if (tmpIndex == 0) {
            return null;
        } else {
            return Arrays.copyOf(tmp, tmpIndex);
        }
    }

    public Item findById(String id) {
        Item tmp = new Item();
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                tmp = items[index];
                break;
            }
        }
        return tmp;
    }
}
