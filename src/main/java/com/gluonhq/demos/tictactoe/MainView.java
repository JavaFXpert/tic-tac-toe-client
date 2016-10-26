package com.gluonhq.demos.tictactoe;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.layout.layer.FloatingActionButton;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;

public class MainView extends View {

    private Board board = new Board();

    public MainView(String name) {

        super(name);
        getStyleClass().add("game-view");

        setCenter(board);

        FloatingActionButton fab = new FloatingActionButton(
                MaterialDesignIcon.REFRESH.text,
                e -> board.restart());

        getLayers().add(fab);


    }
   

    @Override
    protected void updateAppBar(AppBar appBar) {
//        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("Tic Tac Toe");
//        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    }


    
}
