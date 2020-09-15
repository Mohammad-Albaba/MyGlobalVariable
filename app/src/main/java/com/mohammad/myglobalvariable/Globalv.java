package com.mohammad.myglobalvariable;

import android.app.Application;

public class Globalv extends Application {
    private String name;
    private  int Num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }
}
