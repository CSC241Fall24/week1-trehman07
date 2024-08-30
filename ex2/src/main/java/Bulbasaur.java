public class Bulbasaur {
    private int id;
    private int level;

    public Bulbasaur() {
        this.id = 1;
        this.level = 1;
    }

    public void setLevel(int lv) {
        this.level = lv;
        if (lv >= 32) {
            this.id = 3;
        } else if (lv >= 16) {
            this.id = 2;
        }
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        switch (this.id) {
            case 1: return "Bulbasaur";
            case 2: return "Ivysaur";
            case 3: return "Venusaur";
            default: return "Unknown";
        }
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Level: " + this.level + ", ID: " + this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bulbasaur other = (Bulbasaur) obj;
        return this.level == other.level && this.id == other.id;
    }

    public Bulbasaur copy() {
        Bulbasaur clone = new Bulbasaur();
        clone.id = this.id;
        clone.level = this.level;
        return clone;
    }
}
