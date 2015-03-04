package com.hnycmbcreative;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class textDemo extends ApplicationAdapter {
	SpriteBatch batch;
	BitmapFont font;
    String myText;
    BitmapFont.TextBounds bounds;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
        font = new BitmapFont(Gdx.files.internal("helvetica.fnt"));
        myText = "I am glad to be learning how this works\n"
        + "but I don't know how good I will be at it.\n"
        + "but I am still going to try!\n";
        bounds = font.getMultiLineBounds(myText);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        font.setColor(Color.RED);
        font.setScale(.5f);
        font.drawMultiLine(batch,
                myText,
                0,
                Gdx.graphics.getHeight() / 2 + bounds.height / 2,
                Gdx.graphics.getWidth(),
                BitmapFont.HAlignment.CENTER);
                batch.end();
	}
}
