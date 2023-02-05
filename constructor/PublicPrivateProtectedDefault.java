package constructor;

class PublicPrivateProtectedDefault {
	  private int num;
	  private String str;

	  private PublicPrivateProtectedDefault() {
	    // private constructor
	  }
	  
	  public PublicPrivateProtectedDefault(int num) {
	    this.num = num;
	  }
	  
	  protected PublicPrivateProtectedDefault(String str) {
	    this.str = str;
	  }
	  
	  PublicPrivateProtectedDefault(double d) {
	    // default constructor
	  }

	  public PublicPrivateProtectedDefault(int num, String str) {
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
	  
	  public static void main(String[] args) {
	    PublicPrivateProtectedDefault obj1 = new PublicPrivateProtectedDefault();
	    PublicPrivateProtectedDefault obj2 = new PublicPrivateProtectedDefault(10);
	    PublicPrivateProtectedDefault obj3 = new PublicPrivateProtectedDefault("Hello");
	    PublicPrivateProtectedDefault obj4 = new PublicPrivateProtectedDefault(10.5);
	    PublicPrivateProtectedDefault obj5 = new PublicPrivateProtectedDefault(100, "World");
	    
	    System.out.println("Number: " + obj5.getNum());
	    System.out.println("String: " + obj5.getStr());
	    
	    obj5.setNum(200);
	    obj5.setStr("Java");
	    
	    System.out.println("Number: " + obj5.getNum());
	    System.out.println("String: " + obj5.getStr());
	  }
	}
