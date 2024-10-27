package com.de1.AngryBirds.GameObjects.Birds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Yellow extends Bird {

    public Yellow(float xPos, float yPos, int health, int speed, int damage){
        super(xPos, yPos, health, speed, damage);
        this.texture = new Texture(Gdx.files.internal("Images\\YellowBird.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
