package com.task2213;

public class Field { //Он будет отвечать за хранение данных о текущих занятых и свободных клетках на поле игры.
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() { //объект будет отрисовывать на экран свое текущее состояние;

    }

    public void removeFullLines() { //будет удалять из матрицы полностью заполненные строки и сдвигать вышележащие строки вниз;

    }

    public Integer getValue(int x, int y) { //возвращает значение которое находится в матрице с координатами x и y;

        return null;
    }

    public void setValue(int x, int y, int value) {
        matrix[x][y] = value;
    }
}
