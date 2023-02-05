package constructor;

class SuperClass {
	  private int num;
	  private String str;

	  public SuperClass() {
	    this.num = 0;
	    this.str = "";
	  }
	  
	  public SuperClass(int num, String str) {
	    this.num = num;
	    this.str = str;
	  }

	  public int getNum() {
	    return num;
	  }

	  public void setNum(int num) {
	    this.num = num;
	  }

	  public String getStr() {
	    return str;
	  }

	  public void setStr(String str) {
	    this.str = str;
	  }
	}

	class CallSuperFromChild extends SuperClass {
	  private double d;
	  
	  public CallSuperFromChild() {
	    super();
	    this.d = 0.0;
	  }
	  
	  public CallSuperFromChild(int num, String str, double d) {
	    super(num, str);
	    this.d = d;
	  }

	  public double getD() {
	    return d;
	  }

	  public void setD(double d) {
	    this.d = d;
	  }
	  
	  public static void main(String[] args) {
	    CallSuperFromChild obj1 = new CallSuperFromChild();
	    CallSuperFromChild obj2 = new CallSuperFromChild(10, "Hello", 10.5);
	    
	    System.out.println("Number: " + obj2.getNum());
	    System.out.println("String: " + obj2.getStr());
	    System.out.println("Double: " + obj2.getD());
	    
	    obj2.setNum(200);
	    obj2.setStr("Java");
	    obj2.setD(20.5);
	    
	    System.out.println("Number: " + obj2.getNum());
	    System.out.println("String: " + obj2.getStr());
	    System.out.println("Double: " + obj2.getD());
	  }
	}
