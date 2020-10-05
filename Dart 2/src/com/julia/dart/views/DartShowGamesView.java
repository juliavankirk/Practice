package com.julia.dart.views;

import com.julia.dart.Utilities;

public class DartShowGamesView {
    public void render(){
        System.out.println(Utilities.line() + "Product Database - Type one of the options below:\n" +
                "1. Search product\n" +
                "2. Remove product\n" +
                "3. Return to previous menu.") ;
    }

    public void renderExit() { System.out.println("Returning to previous menu."); }

    public void renderError() { System.out.println("Invalid selection, restarting..."); }

    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }
}
