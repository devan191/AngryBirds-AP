package com.de1.AngryBirds.GameObjects.Blocks.GlassBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Glass;

public class HollowSquareGlass extends Glass {

    public HollowSquareGlass(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Glass\\HollowSquareGlass.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
