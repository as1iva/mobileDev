package com.example.app05;

public class Item {
    private int imageResId; // ID ресурса для изображения
    private String text; // Текст для отображения

    // Конструктор для инициализации данных элемента
    public Item(int imageResId, String text) {
        this.imageResId = imageResId;
        this.text = text;
    }

    // Геттеры для доступа к свойствам
    public int getImageResId() {
        return imageResId;
    }

    public String getText() {
        return text;
    }
}

