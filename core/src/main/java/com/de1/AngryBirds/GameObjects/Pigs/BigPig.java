package com.de1.AngryBirds.GameObjects.Pigs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class BigPig extends Pig {

    public BigPig(float xPos, float yPos,int health) {
        super(xPos,yPos,health);

        this.texture = new Texture(Gdx.files.internal("Images\\BigPig.png"));
        setSize(texture.getWidth(), texture.getHeight());
        this.setScale(0.7f);
    }
}
