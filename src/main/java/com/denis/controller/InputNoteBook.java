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
    private String comment;
    public Group group;

    private String homeNumber;
    private String mobileNumber;
    private String secondMobileNumber;

    private String email;
    private String skype;

    public InputNoteBook(View view, Scanner scanner, Model model) {
        this.view = view;
        this.scanner = scanner;
        this.model = model;
    }

    public void InputNote() {
        UtilityController utilityController =
                new UtilityController(scanner, view);
//        String str = String.valueOf(View.resourceBundle.getLocale()).equals("ua")
//                ? REGEX_NAME_UKR : REGEX_NAME_LAT;


        this.firstName = utilityController.
                inputStringValueWithScanner(GET_NAME, View.getString(NAME));
        this.secondName = utilityController.
                inputStringValueWithScanner(GET_SECOND_NAME, View.getString(NAME));
        this.middleName = utilityController.
                inputStringValueWithScanner(GET_MIDDLE_NAME, View.getString(NAME));
        this.fullName = this.secondName + " " + this.firstName.charAt(0) + ".";
        view.printMessage(this.fullName);

        this.login = utilityController.
                inputStringValueWithScanner(GET_NICKNAME, View.getString(LOGIN));
        this.comment = utilityController.
                inputStringValueWithScanner(GET_COMMENT, View.getString(ANY));
        this.group = utilityController.
                inputGroup(GET_Group, View.getString(GROUP));


        this.homeNumber = utilityController.
                inputStringValueWithScanner(GET_HOME_NUMBER, View.getString(HOME_NUMBER));
        this.mobileNumber = utilityController.
                inputStringValueWithScanner(GET_MOBILE_NUMBER, View.getString(MOBILE_NUMBER));
        this.secondMobileNumber = utilityController.
                inputStringValueWithScanner(GET_SECOND_NAME, View.getString(SECOND_MOBILE_NUMBER));

        this.email = utilityController.
                inputStringValueWithScanner(GET_EMAIL, View.getString(EMAIL));
        this.skype = utilityController.
                inputStringValueWithScanner(GET_SKYPE, View.getString(LOGIN));
    }

}
