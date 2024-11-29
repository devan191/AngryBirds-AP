package com.de1.AngryBirds.GameObjects.Birds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.de1.AngryBirds.GameObjects.CataPult;

public class Black extends Bird {

    public Black(World world, float xPos, float yPos, int health, int damage, CataPult cataPult) {
        super(world, xPos, yPos, health, 50, damage, cataPult);

        this.texture = new Texture(Gdx.files.internal("Images/BlackBird.png"));
        setSize(texture.getWidth(), texture.getHeight());
        setOrigin(getWidth() / 2, getHeight() / 2);

        createBody(xPos, yPos);
    }

    protected void createBody(float x, float y) {

        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(x, y);

        this.body = world.createBody(bodyDef);
        float radius = Math.max(getWidth(), getHeight()) / 2f;
        this.radius = radius;
        CircleShape shape = new CircleShape();
        shape.setRadius(radius);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1f;
        fixtureDef.friction = 0.5f;
        fixtureDef.restitution = 0.3f;

        body.createFixture(fixtureDef);
        body.setUserData(this);

        shape.dispose();
    }
}
