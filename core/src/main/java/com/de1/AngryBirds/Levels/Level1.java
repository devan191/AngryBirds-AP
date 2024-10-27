package com.de1.AngryBirds.Levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.de1.AngryBirds.GameObjects.Birds.Bird;
import com.de1.AngryBirds.GameObjects.Birds.Black;
import com.de1.AngryBirds.GameObjects.Birds.Red;
import com.de1.AngryBirds.GameObjects.Birds.Yellow;
import com.de1.AngryBirds.GameObjects.Blocks.Block;
import com.de1.AngryBirds.GameObjects.Blocks.GlassBlocks.*;
import com.de1.AngryBirds.GameObjects.Blocks.StoneBlocks.ThickRectStone;
import com.de1.AngryBirds.GameObjects.Blocks.StoneBlocks.ThinRectStone1;
import com.de1.AngryBirds.GameObjects.Blocks.StoneBlocks.ThinRectStone3;
import com.de1.AngryBirds.GameObjects.Blocks.WoodBlocks.SquareWood;
import com.de1.AngryBirds.GameObjects.Blocks.WoodBlocks.ThinRectWood1;
import com.de1.AngryBirds.GameObjects.CataPult;
import com.de1.AngryBirds.GameObjects.Pigs.BigPig;
import com.de1.AngryBirds.GameObjects.Pigs.KingPig;
import com.de1.AngryBirds.GameObjects.Pigs.Pig;
import com.de1.AngryBirds.GameObjects.Pigs.SmallPig;
import com.de1.AngryBirds.MyGame;
import com.de1.AngryBirds.Screens.LoadingScreen;
import com.de1.AngryBirds.Screens.VictoryScreen;
import org.w3c.dom.Text;

public class Level1 extends Level {

    private Texture mushroom;
    private Sprite mushroomSprite;
    private Texture greenGrass;
    private Sprite greenGrassSprite;

    public Level1(MyGame game, int levelnum) {
        super(game,levelnum);
        this.lvlnum = 1;

        mushroom = new Texture(Gdx.files.internal("Images\\Decors\\Mushroom.png"));
        mushroomSprite = new Sprite(mushroom);
        mushroomSprite.setCenter(1800,303);

        greenGrass = new Texture(Gdx.files.internal("Images\\Decors\\GreenGrass.png"));
        greenGrassSprite = new Sprite(greenGrass);
        greenGrassSprite.setCenter(1850,300);

        createLvL1();

    }

    private void createLvL1(){

        Red red1 = new Red(130,275,100,100,100);
        Red red2 = new Red(182,375,100,100,100);
        Yellow yellow1 = new Yellow(70,275,150,200,150);
        Black black1 = new Black(10,275,300,50,300);

        SmallPig smallPig1 = new SmallPig(1417,330,100);
        BigPig bigPig1 = new BigPig(1320,410,200);
        BigPig bigPig2 = new BigPig(1405,410,200);
        BigPig bigPig3 = new BigPig(1490,410,200);
        KingPig kingPig1 = new KingPig(1394,656,400);

        SquareWood sqwood1 = new SquareWood(1250,315);
        SquareWood sqwood2 = new SquareWood(1550,315);
        HollowSquareGlass hsqglass1 = new HollowSquareGlass(1400,315);
        HollowSquareGlass hsqglass2 = new HollowSquareGlass(1260,560);
        HollowSquareGlass hsqglass3 = new HollowSquareGlass(1530,560);
        ThickRectStone thickrectstone1 = new ThickRectStone(1200,275);
        ThickRectGlass thickrectglass2 = new ThickRectGlass(1300,275);
        ThickRectGlass thickrectglass3 = new ThickRectGlass(1400,275);
        ThickRectGlass thickrectglass4 = new ThickRectGlass(1500,275);
        ThickRectStone thickrectstone2 = new ThickRectStone(1600,275);
        ThinRectStone1 thinrectstone1 = new ThinRectStone1(1315,393); //
        ThinRectWood1 thinrectwood1 = new ThinRectWood1(1315,638); //
        ThinRectGlass3 thinRectglass3 = new ThinRectGlass3(1315,393);
        thinRectglass3.rotateBy(90);
        ThinRectGlass3 thinRectglass31 = new ThinRectGlass3(1585,393);
        thinRectglass31.rotateBy(90);
        ThinRectGlass4 thinrectglass4 = new ThinRectGlass4(1375,653);
        thinrectglass4.rotateBy(90);
        ThinRectGlass4 thinrectglass41 = new ThinRectGlass4(1520,653);
        thinrectglass41.rotateBy(90);

        this.birds.add(red1);
        this.birds.add(red2);
        this.birds.add(yellow1);
        this.birds.add(black1);

        this.pigs.add(smallPig1);
        this.pigs.add(bigPig1);
        this.pigs.add(bigPig2);
        this.pigs.add(bigPig3);
        this.pigs.add(kingPig1);

        this.blocks.add(sqwood1);
        this.blocks.add(sqwood2);
        this.blocks.add(hsqglass1);
        this.blocks.add(hsqglass2);
        this.blocks.add(hsqglass3);
        this.blocks.add(thickrectstone1);
        this.blocks.add(thickrectglass2);
        this.blocks.add(thickrectglass3);
        this.blocks.add(thickrectglass4);
        this.blocks.add(thickrectstone2);
        this.blocks.add(thinrectstone1);
        this.blocks.add(thinrectwood1);
        this.blocks.add(thinrectglass4);
        this.blocks.add(thinrectglass41);

        this.blocks.add(thinRectglass3);
        this.blocks.add(thinRectglass31);

        stage.addActor(red1);
        stage.addActor(red2);
        stage.addActor(yellow1);
        stage.addActor(black1);
        stage.addActor(cataPult);
        stage.addActor(smallPig1);
        stage.addActor(bigPig1);
        stage.addActor(bigPig2);
        stage.addActor(bigPig3);
        stage.addActor(kingPig1);
        stage.addActor(sqwood1);
        stage.addActor(sqwood2);
        stage.addActor(hsqglass1);
        stage.addActor(hsqglass2);
        stage.addActor(hsqglass3);
        stage.addActor(thickrectstone1);
        stage.addActor(thickrectglass2);
        stage.addActor(thickrectglass3);
        stage.addActor(thickrectglass4);
        stage.addActor(thickrectstone2);
        stage.addActor(thinrectstone1);
        stage.addActor(thinrectwood1);
        stage.addActor(thinrectglass4);
        stage.addActor(thinrectglass41);
        stage.addActor(thinRectglass3);
        stage.addActor(thinRectglass31);

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        this.cam.update();
        this.game.batch.setProjectionMatrix(cam.combined);

        this.game.batch.begin();
        this.LvlSprite.draw(this.game.batch);
        this.greenGrassSprite.draw(this.game.batch);
        this.mushroomSprite.draw(this.game.batch);

        this.game.batch.end();

        stage.act(delta);
        stage.draw();
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
        for (Bird bird : this.birds) {
            bird.dispose();
        }
        for(Pig pig : this.pigs){
            pig.dispose();
        }
        cataPult.dispose();
        for (Block block : this.blocks) {
            block.dispose();
        }
        LvlSprite.getTexture().dispose();
        mushroom.dispose();
        greenGrass.dispose();

    }
}
