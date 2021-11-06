public class Main {
	public static void main(String[] args){
		
		bangundatar bdt = new bangundatar();
		Persegi persegi = new Persegi (5);
		Lingkaran lingkaran = new Lingkaran (8);
		
		bdt.luas();
		
		System.out.println("Luas Persegi: " + persegi.luas());
		System.out.println("Luas Lingkaran: " + lingkaran.luas());
	}
}