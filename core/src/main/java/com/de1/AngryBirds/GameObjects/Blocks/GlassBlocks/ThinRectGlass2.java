package com.de1.AngryBirds.GameObjects.Blocks.GlassBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Glass;

public class ThinRectGlass2 extends Glass {

    public ThinRectGlass2(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Glass\\ThinRectGlass2.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
