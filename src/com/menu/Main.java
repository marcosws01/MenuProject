package com.menu;

public class Main {
    public static void main(String[] args) {
    	
    	// Create menus
    	final Menu mainMenu = new Menu(3);
    	final Menu submenu1 = new Menu(4);
        
        
        MenuItem mainItem = new MenuItem().setOption(1).setLabel("Configure network").setAction(new Action() {
            @Override
            public void run() {
                submenu1.run();   
            }
        });
        
        MenuItem exit = new MenuItem(2, "Exit", new Action() {
			@Override
			public void run() {
				System.exit(0);
			}
		});
        
        MenuItem subItem = new MenuItem(1, "Check this out!", new Action() {
            @Override
            public void run() {
                System.out.println("Say Hello!");
            }
        });
        
        
        MenuItem back = new MenuItem(2, "Back", new Action() {
			@Override
			public void run() {
				mainMenu.run();
			}
		});
        
        
        mainMenu.setTitle("Main Menu");
        submenu1.setTitle("SubMenu");
        
        mainMenu.addItem(1, mainItem);
        mainMenu.addItem(2, exit);
        
        submenu1.addItem(1, subItem);
        submenu1.addItem(2, back);
        
        mainMenu.run();
        
    }
    
}
