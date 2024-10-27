package com.de1.AngryBirds.GameObjects.Blocks.GlassBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Glass;

public class ThinRectGlass4 extends Glass {

    public ThinRectGlass4(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Glass\\ThinRectGlass4.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
