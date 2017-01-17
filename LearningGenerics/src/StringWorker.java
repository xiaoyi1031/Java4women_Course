
public class StringWorker<T,U> {
	private T o1;
	private U o2;
	
	public StringWorker(T o1, U o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	
	public String toString(){
		return "StringWorker : " + o1.toString() + " : " + o2.toString();
	}
	
	//this is a static generics method, does no matter with the class at all 
	public static <A> void myMethod(A o1, A o2) {				
	} 
	
	public <A> void myMethod2(A o1, A o2) {				
	} 
	
	public <A,B> void myMethod3(A o1, A o2) {				
	}
	
	public <A,B> void myMethod7(A o1) {				
	}
	
	public <A,B> void myMethod6(B o2) {				
	}
	
//	public <A> void myMethod4(A o1, B o2) {				
//	}
//	
//	public <A,B> A myMethod5(B o2) {
//	}
//	
	
}
