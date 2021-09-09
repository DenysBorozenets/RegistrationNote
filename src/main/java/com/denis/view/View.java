package com.denis.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static final String UA = "ua";
    private static final String EN = "en";

    private static final String BUNDLE_NAME = "messages";
    private static final ResourceBundle resourceBundle =
            ResourceBundle.getBundle(BUNDLE_NAME, new Locale(UA));

    /**
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     *
     * @param message
     * @return
     */
    public String concatString(String... message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String v:message) {
            stringBuilder = stringBuilder.append(v);
        }
        return new String(stringBuilder);
    }

    public void printInputString(String message) {
        printMessage(concatString(
                resourceBundle.getString(TextConstants.GET_INPUT) + " ",
                resourceBundle.getString(message)
        ));
    }

    /**
     *
     * @param message
     */
    public void printWrongInput(String message) {
        printMessage(concatString(
                resourceBundle.getString(TextConstants.WRONG_INPUT_DATA) + " ",
                resourceBundle.getString(TextConstants.GET_INPUT) + " ",
                resourceBundle.getString(message)
        ));
    }
}
