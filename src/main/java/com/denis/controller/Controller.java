package com.denis.controller;

import com.denis.model.Model;
import com.denis.model.NotUniqueLoginException;
import com.denis.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        boolean validation = false;
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, scanner, model);
        inputNoteBook.inputNote();


        while (!validation) {
            try {
                validation = model.validationLogin();
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Repeated login " + e.getLogin());
                inputNoteBook.inputLogin();
            }
        }
    }

}
