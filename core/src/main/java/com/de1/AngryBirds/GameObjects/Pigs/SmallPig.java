package com.de1.AngryBirds.GameObjects.Pigs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class SmallPig extends Pig{
    public SmallPig(float xPos, float yPos,int health){
        super(xPos, yPos, health);

        this.texture = new Texture(Gdx.files.internal("Images\\SmallPig.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
