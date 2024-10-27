package com.de1.AngryBirds.GameObjects.Blocks.StoneBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Stone;

public class ThickRectStone extends Stone {

    public ThickRectStone(float xPos, float yPos) {

        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Stone\\ThickRectStone.png"));
        setSize(texture.getWidth(), texture.getHeight());

    }
}

