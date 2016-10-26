package com.gluonhq.demos.tictactoe;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TicTacToe extends MobileApplication {

    public static final String BASIC_VIEW = HOME_VIEW;

    @Override
    public void init() {
        addViewFactory(BASIC_VIEW, () -> new MainView(BASIC_VIEW));
    }

    @Override
    public void postInit(Scene scene) {

        Swatch.BLUE_GREY.assignTo(scene);

        scene.getStylesheets().add(getClass().getResource("/tictactoe.css").toExternalForm());

        ((Stage) scene.getWindow()).getIcons().add(new Image(TicTacToe.class.getResourceAsStream("/icon.png")));


    }
}
