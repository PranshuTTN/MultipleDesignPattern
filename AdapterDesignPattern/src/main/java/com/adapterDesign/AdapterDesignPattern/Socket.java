package com.adapterDesign.AdapterDesignPattern;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
