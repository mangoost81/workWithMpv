package ui;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUi implements View{
    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUi() {
       scanner = new Scanner(System.in);
       presenter = new Presenter(this);
    }

    public void start() {
        while (true) {
            String sity = scan();
            presenter.getInfo(sity);
        }
    }

    private String scan() {
        System.out.println("Введите город: ");
        return scanner.nextLine();
    }

    public void printAnswer(String text) {
        System.out.println(text);
    }
}
