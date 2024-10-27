package com.de1.AngryBirds.GameObjects.Blocks.StoneBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Stone;

public class ThinRectStone1 extends Stone {

    public ThinRectStone1(float xPos, float yPos) {

        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Stone\\ThinRectStone1.png"));
        setSize(texture.getWidth(), texture.getHeight());

    }
}
