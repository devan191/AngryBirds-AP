package com.de1.AngryBirds.Levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.de1.AngryBirds.MyGame;

public class Level3 extends Level {

    public Level3(MyGame game, int lvl) {
        super(game, lvl);

    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        this.cam.update();
        this.game.batch.setProjectionMatrix(cam.combined);

        this.game.batch.begin();
        this.LvlSprite.draw(this.game.batch);
        this.game.batch.end();

        stage.act(delta);
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        this.stage.dispose();
        this.whitefont.dispose();
        this.blackfont.dispose();
        LvlSprite.getTexture().dispose();

    }
}
