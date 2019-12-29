package io.rjuelich.learn.jmonkey.hello;

import com.jme3.app.SimpleApplication;
import com.jme3.scene.Spatial;
import com.jme3.texture.Texture;
import com.jme3.util.SkyFactory;

public class HelloJMonkey extends SimpleApplication {

	public static void main(final String[] args) {
		new HelloJMonkey().start();
	}

	@Override
	public void simpleInitApp() {
		final Spatial monkey = getAssetManager().loadModel("Scenes/monkey.blend");
		getRootNode().attachChild(monkey);

		final Texture stars = getAssetManager().loadTexture("Scenes/starfield.png");
		final Texture nebula = getAssetManager().loadTexture("Scenes/starfield-nebula.png");
		final Spatial skybox = SkyFactory.createSky(getAssetManager(), stars, stars, stars, nebula, stars, stars);
		getRootNode().attachChild(skybox);
	}

}
