
package dev.billigsteruser.app;

import java.io.Serial;
import java.io.Serializable;


public final class Singleton implements Serializable {
    private static volatile Singleton _instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
    public Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    @Serial
    private Object readResolve() {
        return getInstance();
    }
}
