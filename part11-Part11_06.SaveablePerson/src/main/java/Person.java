
public class Person implements Saveable {

    private String name;
    private String address;

    @Override
    public void save() {
        System.out.println("Saving" + name + "to adress: " + address);
    }

    @Override
    public void delete() {
        System.out.println("Deleting" + name + "from adress: " + address);
    }

    @Override
    public void load(String address) {
        System.out.println("loading from address: " + address);
    }

}
