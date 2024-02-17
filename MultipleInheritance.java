

public class MultipleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.hardworking();  // Output: Method 1 from Parent1
        obj.truthworthy();  // Output: Method 2 from Parent2
    }
}


interface Father {
    void hardworking();
}

interface Mother {
    void truthworthy();
}

class Child implements Father, Mother {
    public void hardworking() {
        System.out.println("Never give up if you fail to your work try again and again");
    }

    public void truthworthy() {
        System.out.println("In every situation you honest to your work.");
    }
}