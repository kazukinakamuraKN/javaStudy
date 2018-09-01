public class Sample1601{
	public static void main (String []args) {
		int Array[] = {1,3,45,3,4};
		add(Array);
		answer(Array);
		sub(Array);
		answer(Array);
		System.out.println(add(10,20));
		introduceOneself("ボブ",180.5,'男');
		email("あて先","タイトル","本文");
		email("タイトル","本文");
		System.out.println(calcTriangleArea(3,6));
		System.out.println(calcCircleArea(9));
	}

	public static void add(int []Array) {
		for(int i = 0;i < Array.length;i++) {
			Array[i]++;
		}
	}

	public static void sub(int Array[]) {
		for(int i = 0;i < Array.length; i++) {
			Array[i]--;
		}
	}

	public static void answer(int Array[]) {
		for(int answer:Array) {
			System.out.println(answer);
		}
	}

	public static int add(int x, int y) {
		return x+y;
	}

	public static void introduceOneself(String name, double sintyou, char gender) {
		System.out.println("私の名前は"+name+"です。身長は"+sintyou+"cmです。性別は"+gender+"です。");
	}

	public static void email(String title,String address,String text) {
		System.out.println("「" + title + "」に、以下のメールを送信しました\n件名：「"
				+ address + "」\n本文：「" + text +"」");
	}

	public static void email(String address,String text) {
		System.out.println("「  未定  」に、以下のメールを送信しました\n件名：「"
				+ address + "」\n本文：「" + text +"」");
	}

	public static double calcTriangleArea(double bottom,double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}


}