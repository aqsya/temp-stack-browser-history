package com.github.affandes.kuliah.pm.browserhistory;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> history = new Stack<>();

    // browse → menambah history
    public void browse(String url) {
        history.push(url);
        System.out.println("Browsing: " + url);
    }

    // back → kembali ke URL sebelumnya
    public void back() {
        if (history.isEmpty()) {
            System.out.println("No history to go back.");
        } else {
            String removed = history.pop();
            System.out.println("Back from: " + removed);
        }
    }

    // view → tampilkan dari terbaru
    public void view() {
        if (history.isEmpty()) {
            System.out.println("History is empty.");
        } else {
            System.out.println("\nBrowser History (Newest First):");
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println("- " + history.get(i));
            }
        }
    }
}
