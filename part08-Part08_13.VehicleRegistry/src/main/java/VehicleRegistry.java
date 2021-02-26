
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licencePlate, String owner) {
        for (LicensePlate plate : registry.keySet()) {
            if (plate.equals(licencePlate)) {
                return false;
            }
        }
        registry.put(licencePlate, owner);
        return true;

    }

    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        for (LicensePlate plate : registry.keySet()) {
            if (plate.equals(licensePlate)) {
                registry.remove(licensePlate);
                return true;
            }
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> ownersAlredyPrinted = new ArrayList<>();
        for (LicensePlate plate : registry.keySet()) {
            String tempOwner = registry.get(plate);
            if (!ownersAlredyPrinted.contains(tempOwner)) {
                System.out.println(tempOwner);
                ownersAlredyPrinted.add(tempOwner);
            }
        }
    }

}
