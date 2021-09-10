package com.denis.controller;

import com.denis.model.Model;
import com.denis.model.NotUniqueLoginException;
import com.denis.model.NoteBook;
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
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, scanner, model);
        inputNoteBook.InputNote();

        NoteBook noteBook = getNoteBook(inputNoteBook);
        System.out.println(noteBook);
    }

    private NoteBook getNoteBook(InputNoteBook inputNoteBook) {
        NoteBook noteBook = null;
        while(true) {
            try {
                noteBook = new NoteBook(noteBook.getFirstName(),
                        inputNoteBook.getLogin());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Repeated login " + e.getLoginData());
                inputNoteBook.inputLogin();
            }
        }
        return noteBook;
    }
}
