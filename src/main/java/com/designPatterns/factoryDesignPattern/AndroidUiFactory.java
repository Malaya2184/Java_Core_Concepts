package com.designPatterns.factoryDesignPattern;

import com.designPatterns.factoryDesignPattern.components.buttons.AndroidButton;
import com.designPatterns.factoryDesignPattern.components.buttons.Button;
import com.designPatterns.factoryDesignPattern.components.dropdowns.AndroidDropdown;
import com.designPatterns.factoryDesignPattern.components.dropdowns.DropDown;
import com.designPatterns.factoryDesignPattern.components.menus.AndroidMenu;
import com.designPatterns.factoryDesignPattern.components.menus.Menu;

public class AndroidUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropdown();
    }
}
