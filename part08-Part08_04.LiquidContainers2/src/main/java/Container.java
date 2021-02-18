
public class Container {

    private int maxCap;
    private int load;

    public Container() {
        this.maxCap = 100;
        this.load = 0;
    }

    public int contains() {
        return this.load;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.load += amount;
            if (this.load > this.maxCap) {
                this.load = this.maxCap;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.load -= amount;
            if (this.load < 0) {
                this.load = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.contains() + "/100";
    }
}
