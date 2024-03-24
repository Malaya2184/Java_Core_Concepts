package com.designPatterns.factoryDesignPattern;
import com.designPatterns.factoryDesignPattern.components.buttons.Button;
import com.designPatterns.factoryDesignPattern.components.dropdowns.DropDown;
import com.designPatterns.factoryDesignPattern.components.menus.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public DropDown createDropDown();
}
