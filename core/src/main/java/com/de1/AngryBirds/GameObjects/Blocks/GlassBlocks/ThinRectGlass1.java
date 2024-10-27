package com.de1.AngryBirds.GameObjects.Blocks.GlassBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Glass;

public class ThinRectGlass1 extends Glass {

    public ThinRectGlass1(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Glass\\ThinRectGlass1.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
