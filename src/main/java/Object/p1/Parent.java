package main.java.Object.p1;

public class Parent {
    public void printPublic() {
        System.out.println("public");
    }

    protected void printProtected() {
        System.out.println("protected");
    }

    void printDefault() {
        System.out.println("default");
    }

    private void printPrivate() {
        System.out.println("private");
    }


    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printDefault();
        parent.printProtected();
        parent.printPrivate();
        parent.printPublic();
    }
}
