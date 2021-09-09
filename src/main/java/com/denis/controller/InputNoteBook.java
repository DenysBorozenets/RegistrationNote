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

    private String index;

    private String city;
    private String street;
    private String houseNumber;
    private String flat;
    private String fullAddress;

    private String date;

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
                inputStringValueWithScanner(GET_SECOND_MOBILE_NUMBER, View.getString(SECOND_MOBILE_NUMBER));

        this.email = utilityController.
                inputStringValueWithScanner(GET_EMAIL, View.getString(EMAIL));
        this.skype = utilityController.
                inputStringValueWithScanner(GET_SKYPE, View.getString(LOGIN));

        this.index = utilityController.
                inputStringValueWithScanner(GET_INDEX, View.getString(INDEX));
        this.city = utilityController.
                inputStringValueWithScanner(GET_CITY, View.getString(CITY));
        this.street = utilityController.
                inputStringValueWithScanner(GET_STREET, View.getString(STREET));
        this.houseNumber = utilityController.
                inputStringValueWithScanner(GET_BUILDING, View.getString(BUILDING));
        this.flat = utilityController.
                inputStringValueWithScanner(GET_FLAT, View.getString(FLAT));
        this.fullAddress = this.index + " " + this.city + " " + this.street + " " +
                this.houseNumber + " " + this.flat;
        view.printMessage(this.fullAddress);

        this.date = utilityController.
                inputStringValueWithScanner(GET_DATE, View.getString(DATE));



        model.setField("firstName", this.firstName);
    }

}
