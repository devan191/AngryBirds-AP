package com.de1.AngryBirds.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.de1.AngryBirds.GameObjects.Birds.Bird;

public class CataPult extends Actor {

    protected Texture texture;
    protected float xPos, yPos;
    protected Bird bird;

    public CataPult(float xPos, float yPos) {

        this.xPos = xPos;
        this.yPos = yPos;
        setPosition(xPos, yPos);
        this.texture = new Texture(Gdx.files.internal("Images\\Catapult1.png"));
        setSize(texture.getWidth(), texture.getHeight());
        this.setScale(0.3f);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(
            this.texture,
            getX(), getY(),
            getOriginX(), getOriginY(),
            getWidth(), getHeight(),
            getScaleX(), getScaleY(),
            getRotation(),
            0, 0, (int)getWidth(), (int)getHeight(),
            false, false
        );
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    public void dispose() {
        this.texture.dispose();
    }

}
