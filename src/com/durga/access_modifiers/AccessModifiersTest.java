package com.durga.access_modifiers;

public class AccessModifiersTest {//public.strictfp,final,default,abstract
	
	  protected void test() {
		System.out.println("PARENT TEST METHOD");
	}

	public static void main(String[] args) {

		AccessModifiersTest am=new ChildAccessModifiers();
		am.test();//It will choose parent method if we use private modifier otherwise It always chooses child method
		
		//ChildAccessModifiers am1=(ChildAccessModifiers) new AccessModifiersTest();//ClassCastException: class com.durga.access_modifiers.AccessModifiersTest cannot be cast
		//am1.test();
	}

}

class ChildAccessModifiers extends AccessModifiersTest{// We can't extend if We use final in parent class
	  protected void test() { // We can't override this method if We use final in parent method
		System.out.println("CHILD TEST METHOD");
	}
}
