package dev.billigsteruser.app;

// Interface for the new IStorage
interface IStorage {
    void saveData(String data);
}

// Legacy class that works with the old interface
class LegacyStorage {
    void storeData(String data) {
        System.out.println("Saving data: " + data);
    }
}

// Adapter that converts the old interface to the new one
class LegacyStorageAdapter implements IStorage {
    private final LegacyStorage legacyStorage;

    public LegacyStorageAdapter(LegacyStorage legacyStorage) {
        this.legacyStorage = legacyStorage;
    }

    @Override
    public void saveData(String data) {
        // Adapting the call to the old interface
        legacyStorage.storeData(data);
    }
}

// Example application
public class Adapter {

    public static void main(String[] args) {
        // Using the adapter
        LegacyStorage legacyStorage = new LegacyStorage();
        IStorage iStorage = new LegacyStorageAdapter(legacyStorage);

        // Saving data using the new interface
        iStorage.saveData("Sample data");
    }
}
