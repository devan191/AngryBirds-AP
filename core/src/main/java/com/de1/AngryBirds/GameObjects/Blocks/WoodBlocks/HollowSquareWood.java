package com.de1.AngryBirds.GameObjects.Blocks.WoodBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Wood;

public class HollowSquareWood extends Wood {

    public HollowSquareWood(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Wood\\HollowSquareWood.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
