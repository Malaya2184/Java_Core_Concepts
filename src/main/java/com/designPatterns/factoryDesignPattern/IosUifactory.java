package com.designPatterns.factoryDesignPattern;

import com.designPatterns.factoryDesignPattern.UIFactory;
import com.designPatterns.factoryDesignPattern.components.buttons.Button;
import com.designPatterns.factoryDesignPattern.components.buttons.IosButton;
import com.designPatterns.factoryDesignPattern.components.dropdowns.DropDown;
import com.designPatterns.factoryDesignPattern.components.dropdowns.IosDropDown;
import com.designPatterns.factoryDesignPattern.components.menus.IosMenu;
import com.designPatterns.factoryDesignPattern.components.menus.Menu;

public class IosUifactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
