package collectionsArrayList;
import java.util.ArrayList;
public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer>sk=new ArrayList<>();
		sk.add(10);
		sk.add(20);
		sk.add(30);
		sk.add(1,40);
//		sk.remove(0);
//		System.out.println(sk.get(0));
//		System.out.println(sk);
//		System.out.println(sk.get(0));//getting values from arraylist
//		System.out.println(sk.size());//getting size of ArrayList
//		System.out.println(sk);//printing the values from arraylist
//		sk.set(0,25);
//	System.out.println(sk);//replacing values from orginal value
//		sk.remove(2);
//		System.out.println(sk);
//		sk.set(0, 43);
//		System.out.println(sk);
//		for(int i=0;i<sk.size();i++) {
//			System.out.println(sk.get(i));
//		}
//		sk.forEach(s-> {
//			if(s%2==0) {
//				System.out.println(s);
//			}
//			});
		int n=250;
		Integer a=Integer.hashCode(n);
		System.out.println(a);
		
	}
}
