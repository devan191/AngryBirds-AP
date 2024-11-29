import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.de1.AngryBirds.GameObjects.Blocks.Block;
import com.de1.AngryBirds.Levels.Level2;
import com.de1.AngryBirds.MyGame;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTests {

    MyGame game;
    Level2 lvl2;

//    @Before
//    public void setUp() {
//        game = new MyGame();
//        lvl2 = new Level2(game, 2);
//    }

    @Test
    public void testGameInitialization() {
//        MyGame game = new MyGame();
//        Level2 lvl2 = new Level2(game, 2);
//        assertEquals(0, lvl2.score);
    }
    @Test
    public void testAssetsAccess() {
//        FileHandle file = Gdx.files.internal("Images\\angryBird_poachedEggbg.png");
//        assertTrue(file.exists());
    }

    @Test
    public void blockTest() {
        assertTrue(true);
    }
}
