package collectionsArrayList;

public class Mobile {
  private	String brand;
	private int price;
	private boolean is5g;
		public Mobile(String brand,int price,boolean is5g) {
			this.brand=brand;
			this.price=price;
			this.is5g=is5g;
		}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public String getBrand() {
			return brand;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public int getPrice() {
			return price;
		}
		public void setIs5g(boolean is5g) {
			this.is5g=is5g;
		}
		public boolean getIs5g() {
			return is5g;
		}
		public String toString() {
			return brand+" "+price+" "+is5g;
		}
}
