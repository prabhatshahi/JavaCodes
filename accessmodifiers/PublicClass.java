package accessmodifiers;

class PublicClasss{
    public String pName = "Public";

    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}
public class PublicClass {
    public static void main(String[] args) {
        PublicClasss pub = new PublicClasss ();
        pub.pName = "Public Method";
        pub.publicMethod();
    }
}