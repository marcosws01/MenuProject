package com.menu;

public class MenuItem {
    private int option;
    private String label;
    private Action action;
    
    public MenuItem() {  }
    public MenuItem(int option, String label, Action action) {
        this.option = option;
        this.label = label;
        this.action = action;
    }
    
    public MenuItem setOption(int option) {
        this.option = option;
        return this;
    }
    
    public MenuItem setLabel(String label) {
        this.label = label;
        return this;
    }
    
    public MenuItem setAction(Action action) {
        this.action = action;
        return this;
    }
    
    public void run() {
        this.action.run();
    }
    
    public String toString() {
        return String.format("%2d - %s", this.option, this.label);
    }
}
