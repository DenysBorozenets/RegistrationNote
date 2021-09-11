package com.denis.controller;

import com.denis.model.Group;
import com.denis.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printInputString(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return res;
    }

//    public String inputTextValueWithScanner(String message, String regex) {
//        String res;
//        view.printInputString(message);
//        scanner.nextLine();
//        while (!(scanner.hasNextLine() && (res = scanner.nextLine()).matches(regex))) {
//            view.printWrongInput(message);
//        }
//        return res;
//    }

    public Group inputGroup(String message, String regex) {
        String res;
        view.printInputString(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return Group.valueOf(res.toUpperCase());
    }
}
