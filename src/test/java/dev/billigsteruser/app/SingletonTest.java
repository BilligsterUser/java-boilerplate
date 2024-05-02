package dev.billigsteruser.app;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

public class SingletonTest {


    // getInstance method returns the same instance when called multiple times
    @Test
    public void test_returns_same_instance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertSame(instance1, instance2);
    }

    // Singleton class throws an exception if cloned
    @Test
    public void test_throws_exception_if_cloned() {
        assertThrows(CloneNotSupportedException.class, () -> {
            Singleton.getInstance().clone();
        });
    }
}