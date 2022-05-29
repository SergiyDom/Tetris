package com.task2213;

public class Tetris {
    private Field field;
    private Figure figure;

    public static Tetris game;

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        game = tetris;
        game.run();

    }

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void run() {

    }

    public void step() {
        
    }
}
