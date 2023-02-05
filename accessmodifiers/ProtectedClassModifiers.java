package accessmodifiers;

public class ProtectedClassModifiers {
	
	protected String name;

    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

class protectedClass{
    public static void main(String[] args) {
    	ProtectedClassModifiers  pc = new ProtectedClassModifiers();
        pc.name = "Protected Method";
        pc.protectedMethod();
    }

}
