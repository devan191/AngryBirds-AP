package com.de1.AngryBirds.GameObjects.Blocks.WoodBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Wood;

public class ThinRectWood4 extends Wood {

    public ThinRectWood4(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Wood\\ThinRectWood4.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
