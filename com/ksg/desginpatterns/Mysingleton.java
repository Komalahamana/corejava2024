package com.ksg.desginpatterns;

public class Mysingleton {

	private static Mysingleton instance;

    private Mysingleton() {

    }

    public static Mysingleton getInstance() {

        if (instance == null) {
            instance = new Mysingleton();
        }

        return instance;

    }
    
    @Override
    public Object clone() {
        return this;
        
	}

}
