package com.denis.controller;

import com.denis.model.Group;
import com.denis.model.Model;
import com.denis.view.View;
import static com.denis.controller.RegexContainer.*;
import static com.denis.view.TextConstants.*;

import java.util.Scanner;

public class InputNoteBook {
    private View view;
    private Model model;
    private Scanner scanner;


    private String firstName;
    private String secondName;
    private String middleName;
    private String fullName;

    private String login;
    public Group group;

    public InputNoteBook(View view, Scanner scanner, Model model) {
        this.view = view;
        this.scanner = scanner;
        this.model = model;
    }

    public void InputNote() {
        UtilityController utilityController =
                new UtilityController(scanner, view);
        String str = String.valueOf(View.resourceBundle.getLocale()).equals("ua")
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;


        this.firstName = utilityController.inputStringValueWithScanner(GET_NAME, str);
        this.secondName = utilityController.inputStringValueWithScanner(GET_SECOND_NAME, str);
        this.middleName = utilityController.inputStringValueWithScanner(GET_MIDDLE_NAME, str);
        this.fullName = this.secondName + " " + this.firstName.charAt(0) + ".";
        view.printMessage(this.fullName);
    }

}
