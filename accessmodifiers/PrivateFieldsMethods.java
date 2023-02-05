package accessmodifiers;

public class PrivateFieldsMethods {
	
	 private String name = "Sharan";
	    private int age = 21;

	    //private method
	    private void pvtMethod() {
	        System.out.println("My Name is " + name + " and my age is " + age);
	    }

	    //main method
	    public static void main(String[] args) {
	        PrivateFieldsMethods obj = new PrivateFieldsMethods();
	        System.out.println(obj.age);
	        System.out.println(obj.name);
	        obj.pvtMethod();
	    }

}
