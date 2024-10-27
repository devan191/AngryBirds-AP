package com.de1.AngryBirds;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.de1.AngryBirds.Levels.Level;
import com.de1.AngryBirds.Screens.SplashScreen;

import java.util.ArrayList;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class MyGame extends Game {

    public SpriteBatch batch;
    public int TotalPointsEarned;
    public int StarsEarned;
    public int LevelsCleared;
    public int TotalLvLs;
    public Level[] levels;
    public Music bgMusic;

    @Override
    public void create() {
        batch = new SpriteBatch();
        this.TotalPointsEarned = 0;
        this.StarsEarned = 0;
        this.LevelsCleared = 1;
        this.TotalLvLs = 10;
        levels = new Level[this.TotalLvLs+1];

        bgMusic = Gdx.audio.newMusic(Gdx.files.internal("Sound\\Angry-Birds-Theme-Song.mp3"));
        bgMusic.setLooping(true);
        bgMusic.setVolume(0.05f);
        bgMusic.play();

        setScreen(new SplashScreen(this));
    }

    @Override
    public void dispose() {
        batch.dispose();
        bgMusic.dispose();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

}
