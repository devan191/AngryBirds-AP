package com.de1.AngryBirds.Levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.de1.AngryBirds.GameObjects.Birds.Bird;
import com.de1.AngryBirds.GameObjects.Blocks.Block;
import com.de1.AngryBirds.GameObjects.CataPult;
import com.de1.AngryBirds.GameObjects.Pigs.Pig;
import com.de1.AngryBirds.MyGame;
import com.de1.AngryBirds.Screens.DefeatScreen;
import com.de1.AngryBirds.Screens.LevelScreen;
import com.de1.AngryBirds.Screens.LoadingScreen;
import com.de1.AngryBirds.Screens.VictoryScreen;

import java.util.ArrayList;

public class Level implements Screen {

    protected MyGame game;
    protected int lvlnum;
    protected int stars;
    protected int score;
    protected int HighestScore;
    protected boolean isCleared;
    protected Viewport viewport;
    protected OrthographicCamera cam;
    protected ArrayList<Bird> birds;
    protected ArrayList<Pig> pigs;
    protected ArrayList<Block> blocks;
    protected CataPult cataPult;
    protected Sprite LvlSprite;
    protected Stage stage;
    protected BitmapFont whitefont;
    protected BitmapFont blackfont;
    protected Table table;
    protected boolean paused;
    protected Window pauseWin;
    protected Label scorelabel;
    protected Label scoreval;

    public Level(MyGame game, int levelnum){
        this.game = game;
        this.lvlnum = levelnum;
        this.stars = 0;
        this.HighestScore = 0;
        this.score = 0;
        this.isCleared = false;
        this.blackfont = new BitmapFont(Gdx.files.internal("Fonts\\black.fnt"));
        this.whitefont = new BitmapFont(Gdx.files.internal("Fonts\\white.fnt"));
        this.cam = new OrthographicCamera();
        this.viewport = new FitViewport(1920,820,cam);
        this.birds = new ArrayList<>();
        this.pigs = new ArrayList<>();
        this.blocks = new ArrayList<>();
        this.cataPult = new CataPult(180,275);
        this.LvlSprite = new Sprite(new Texture(Gdx.files.internal("Images\\angryBird_poachedEggbg.png")));
        this.stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        this.table = new Table();
        this.table.setFillParent(true);
        this.paused = false;
        this.scorelabel = new Label("Score",new Label.LabelStyle(this.blackfont,Color.BLACK));
        scorelabel.setFontScale(2.0f);
        scorelabel.setPosition(1650,770);
        this.stage.addActor(this.scorelabel);
        this.scoreval = new Label(this.score+"",new Label.LabelStyle(this.whitefont,Color.WHITE));
        scoreval.setFontScale(2.0f);
        scoreval.setPosition(1850,770);
        this.stage.addActor(this.scoreval);

        createPauseMenu();
        this.stage.addActor(pauseWin);


        TextButton.TextButtonStyle pauseButtonStyle = new TextButton.TextButtonStyle();
        pauseButtonStyle.font = whitefont;
        pauseButtonStyle.fontColor = Color.WHITE;
        pauseButtonStyle.up = new TextureRegionDrawable(new Texture(Gdx.files.internal("Images\\PauseButton.png")));

        TextButton pauseButton = new TextButton("", pauseButtonStyle);
        pauseButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Level.this.game.bgMusic.pause();
                showPauseMenu();
            }
        });

        TextButton.TextButtonStyle replayButtonStyle = new TextButton.TextButtonStyle();
        replayButtonStyle.font = whitefont;
        replayButtonStyle.fontColor = Color.WHITE;
        replayButtonStyle.up = new TextureRegionDrawable(new Texture(Gdx.files.internal("Images\\replayButton.png")));

        TextButton replayButton = new TextButton("", replayButtonStyle);
        replayButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Level.this.game.setScreen(new LoadingScreen(Level.this.game,Level.this.lvlnum));
            }
        });

        TextButton.TextButtonStyle winButtonStyle = new TextButton.TextButtonStyle();
        winButtonStyle.font = whitefont;
        winButtonStyle.fontColor = Color.WHITE;
        winButtonStyle.up = new TextureRegionDrawable(new Texture(Gdx.files.internal("Images\\MenuButtonTex.png")));

        TextButton winButton = new TextButton("WIN", winButtonStyle);
        winButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Level.this.game.bgMusic.pause();
                Level.this.game.setScreen(new VictoryScreen(Level.this.game, Level.this.lvlnum));
            }
        });

        this.table.top().left().padTop(30).padLeft(30);
        this.table.add(pauseButton).padRight(10);
        this.table.add(replayButton).padRight(30);
        this.table.add(winButton);
        this.stage.addActor(this.table);

    }

    protected void createPauseMenu() {
        Window.WindowStyle windowStyle = new Window.WindowStyle();
        windowStyle.titleFont = whitefont;
        windowStyle.background = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("Images\\WinBG.png"))));

        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = whitefont;
        textButtonStyle.up = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("Images\\MenuButtonTex.png"))));

        pauseWin = new Window("Paused", windowStyle);
        pauseWin.setSize(300, 400);
        pauseWin.setPosition(820 , 310 );
        pauseWin.setMovable(false);

        TextButton resumeButton = new TextButton("Resume", textButtonStyle);
        resumeButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Level.this.game.bgMusic.play();
                hidePauseMenu();
            }
        });

        TextButton exitButton = new TextButton("Quit", textButtonStyle);
        exitButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {

                game.levels[Level.this.lvlnum] = null;
                game.setScreen(new DefeatScreen(game,Level.this.lvlnum));
            }
        });

        TextButton saveGameButton = new TextButton("Save and Exit", textButtonStyle);
        saveGameButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Level.this.game.bgMusic.play();
                hidePauseMenu();
                game.setScreen(new LevelScreen(game));
            }
        });

        pauseWin.add(resumeButton).pad(10).row();
        pauseWin.add(saveGameButton).pad(10).row();
        pauseWin.add(exitButton).pad(10).row();

        pauseWin.setVisible(false);

    }

    protected void showPauseMenu() {
        paused = true;
        pauseWin.setVisible(true);
    }

    protected void hidePauseMenu() {
        paused = false;
        pauseWin.setVisible(false);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
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

    }
}
