package com.hnycmbcreative;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class poll extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    Sprite sprite;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
        sprite = new Sprite(img);
        sprite.setPosition(Gdx.graphics.getWidth()/2 - sprite.getWidth()/2,
                Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);
	}

	@Override
	public void render () {

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            sprite.translateX(-1f);
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            sprite.translateX(1f);
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
            sprite.translateY(-1f);
        if(Gdx.input.isKeyPressed(Input.Keys.UP))
            sprite.translateY(1f);
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
            sprite.setPosition(Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY());
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY());
		batch.end();
	}

    @Override
    public void dispose(){
        img.dispose();
    }
}
