package com.javaBasics.pojo;

class StaticNonStaticClasses {

	static class StaticInner {
		static  void methodStaticInner() {
			System.out.println("Static Inner Method");
		}
		void methodNonStaticInner() {
			System.out.println("Non-Static Inner Method");
		}
	}
	
	class NonStaticInner {
		void methodStaticInner() {
			System.out.println("Non-Static Inner Method");
		} // inside non static inner class there can be only non static methods
		void methodNonStaticInner() {
			System.out.println("Non-Static Inner Method");
		}
	}
	
	public static void main(String args[]) {
		
	}
}
