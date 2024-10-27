package com.de1.AngryBirds.GameObjects.Birds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Black extends Bird{

    public Black(float xPos, float yPos, int health, int speed, int damage){
        super(xPos, yPos, health, speed, damage);
        this.texture = new Texture(Gdx.files.internal("Images\\BlackBird.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
