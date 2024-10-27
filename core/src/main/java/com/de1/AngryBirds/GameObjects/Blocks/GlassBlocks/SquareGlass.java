package com.de1.AngryBirds.GameObjects.Blocks.GlassBlocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.de1.AngryBirds.GameObjects.Blocks.Glass;

public class SquareGlass extends Glass {

    public SquareGlass(float xPos, float yPos) {
        super(xPos, yPos);

        this.texture = new Texture(Gdx.files.internal("Images\\Glass\\SquareGlass.png"));
        setSize(texture.getWidth(), texture.getHeight());
    }
}
