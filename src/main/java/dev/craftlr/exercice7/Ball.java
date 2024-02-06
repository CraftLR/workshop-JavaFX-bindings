package dev.craftlr.exercice7;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import static javafx.beans.binding.Bindings.when;

public class Ball {

    private final DoubleProperty positionX;
    private final DoubleProperty positionY;
    private final DoubleProperty velocityX; // en pixel par nanosecond
    private final DoubleProperty velocityY; // en pixel par nanosecond
    private final DoubleProperty radius;
    private final Pane parent;
    private Circle ball;

    private BooleanExpression isBouncingOffVerticalWall;
    private BooleanExpression isBouncingOffHorizontalWall;

    private NumberBinding bounceOffVerticalWall;
    private NumberBinding bounceOffHorizontalWall;

    public Ball(Pane parent) {
        throw new NoSuchMethodError("Not yet implemented !");
    }

    private void createBindings() {
        throw new NoSuchMethodError("Not yet implemented !");
    }

    public void move(long elapsedTimeInNanoseconds) {
        throw new NoSuchMethodError("Not yet implemented !");
    }
}
