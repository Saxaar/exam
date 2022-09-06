package OOP.Test;


import java.util.Objects;

public  class Class2 {
    private String name;

    public Class2(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Class2{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print () {
        System.out.println(name);
    }
}
