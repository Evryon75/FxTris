package fxtris.Main.Minoes.Tetrominoes;

import fxtris.Main.Minoes.Tetromino;
import javafx.scene.paint.Color;

import static fxtris.Main.Others.GlobalValues.TILE;

public class T extends Tetromino {

    public T() {
        super(Color.FUCHSIA);
        this.tetrominoID = 6;
    }

    @Override
    public void update() {

        switch (this.rotationIndex) {
            case 1 -> {
                minoA.setY(minoCentral.getY());
                minoA.setX(minoCentral.getX() - TILE);
                minoB.setY(minoCentral.getY() - TILE);
                minoB.setX(minoCentral.getX());
                minoC.setY(minoCentral.getY());
                minoC.setX(minoCentral.getX() + TILE);
            }
            case 2 -> {
                minoA.setY(minoCentral.getY() + TILE);
                minoA.setX(minoCentral.getX());
                minoB.setY(minoCentral.getY());
                minoB.setX(minoCentral.getX() + TILE);
                minoC.setY(minoCentral.getY() - TILE);
                minoC.setX(minoCentral.getX());
            }
            case 3 -> {
                minoA.setY(minoCentral.getY() + TILE);
                minoA.setX(minoCentral.getX());
                minoB.setY(minoCentral.getY());
                minoB.setX(minoCentral.getX() + TILE);
                minoC.setY(minoCentral.getY());
                minoC.setX(minoCentral.getX() - TILE);
            }
            case 4 -> {
                minoA.setY(minoCentral.getY() + TILE);
                minoA.setX(minoCentral.getX());
                minoB.setY(minoCentral.getY());
                minoB.setX(minoCentral.getX() - TILE);
                minoC.setY(minoCentral.getY() - TILE);
                minoC.setX(minoCentral.getX());
            }
        }
    }
}
