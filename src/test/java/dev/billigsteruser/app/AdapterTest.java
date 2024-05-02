package dev.billigsteruser.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdapterTest {
    // Adapter can create a new instance of LegacyStorageAdapter.
    @Test
    public void test_create_legacy_storage_adapter() {
        LegacyStorage legacyStorage = new LegacyStorage();
        IStorage iStorage = new LegacyStorageAdapter(legacyStorage);
        assertNotNull(iStorage);
    }
}