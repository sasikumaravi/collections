package collectionsArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class UseMobile {
	public static void main(String[] args) {
		Mobile mob1=new Mobile("Redmi",8000,true);
		Mobile mob2=new Mobile("oppo",9000,false);
		Mobile mob3=new Mobile("moto",10000,true);
		ArrayList<Mobile> m1=new ArrayList<>();
			m1.add(mob1);
			m1.add(mob2);
			m1.add(mob3);
//			for(Mobile m:m1) {
//				System.out.println(m);
//			}
			m1.stream().sorted(Comparator.comparing(Mobile::getPrice).reversed()).forEach(c->System.out.println(c));
//			List<Mobile>ab=Arrays.asList(mob1,mob2,mob3);
//			System.out.println(m1);
//			ArrayList<Mobile>m2=new ArrayList<>();
//				for(int i=0;i<m1.size();i++) {
//					if(m1.get(i).getPrice()>=9000) {
//						System.out.println(m1.get(i));
//					}
//				}
//				m1.forEach(s-> {
//					if(s.getPrice()>8000) {
//						System.out.println(s.getBrand());
//					}
//				});
//				for(int i=0;i<m1.size();i++) {
//					if(m1.get(i).getIs5g()==false) {
//						m2.add(m1.get(i));
//					}
//				}
	}
}
