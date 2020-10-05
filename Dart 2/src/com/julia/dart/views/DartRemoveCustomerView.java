package com.julia.dart.views;

import com.julia.dart.Utilities;

import java.util.UUID;

public class DartRemoveCustomerView {
    public void render(String name) {

        System.out.println(Utilities.line() + "Which customer should be removed?\n" +
                " ID:" + name);
    }

    public void renderSuccess(String name) { System.out.println("Successfully removed a " + name); }

    public void renderError() { System.out.println("Invalid entry, please try again."); }

    public UUID read() {
        String input = Utilities.stringInput();
        UUID retVal = null; //initialize as null otherwise compiler doesn't know what to do with it/ have to give it
        //initial value
        try {
            retVal = UUID.fromString(input); //converts UUID from a string
            return retVal;
        } catch (IllegalArgumentException e) {
            return retVal;
        }
    }
}
