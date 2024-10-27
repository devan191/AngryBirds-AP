package com.de1.AngryBirds.GameObjects.Blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Stone extends Block{

    public Stone(float xPos, float yPos){
        super(xPos, yPos);
        this.health = 300;
    }
}
