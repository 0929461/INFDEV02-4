package com.gdx.designpatterns;

// Describes a label GUI element
import com.badlogic.gdx.graphics.Color;

public class Label implements IGUIElement {

    public String content;
    public Integer size;
    public Color color;
    public Point top_left;

    public Label(String content, Point top_left, Integer size, Color color) {
        this.size = size;
        this.color = color;
        this.top_left = top_left;
        this.content = content;
    }

    @Override
    public void draw(IDrawVisitor visitor) {
       //TODO: ADD MISSING CODE HERE
    }

    @Override
    public void update(IUpdateVisitor visitor, Float dt) {
    }
}
