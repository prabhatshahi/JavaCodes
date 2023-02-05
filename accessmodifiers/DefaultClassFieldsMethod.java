package accessmodifiers;

class DefaultClass_02 {
    //Default fields
    int myAge;
    String myName;

    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

//Accessing default fields and method from other class in the same package
public class DefaultClassFieldsMethod {
    public static void main(String[] args) {
        DefaultClass_02 obj = new DefaultClass_02();
        obj.myAge = 21;
        obj.myName = "Sharan";
        obj.defaultMethod();
    }
}
