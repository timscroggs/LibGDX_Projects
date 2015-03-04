package com.hnycmbcreative;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloWorld extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    Sprite sprite;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("helloWorld.png");
        sprite = new Sprite(img);
        sprite.setPosition(
                Gdx.graphics.getWidth()/2 - sprite.getWidth()/2,
                Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);
        //sprite.setScale(1.0f, 2.0f);
        //sprite.setRotation(90f);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY(), img.getWidth()/2, img.getHeight()/2, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(), sprite.getScaleY(), sprite.getRotation());
		batch.end();
	}
}
