package com.designPatterns.adaptor;

public class PrinterAdaptor implements ModernPrinter{
    private LgacyPrinter lgacyPrinter;

    public PrinterAdaptor(LgacyPrinter lgacyPrinter) {
        this.lgacyPrinter = lgacyPrinter;
    }

    @Override
    public void printDocument(String documnt) {
        this.lgacyPrinter.print(documnt);
    }
}
