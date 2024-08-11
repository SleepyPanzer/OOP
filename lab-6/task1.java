 class Mathematics {
	public int square(int num) {
			return num * num;
	}
	public double square(double num) {
			return num * num;
	}
	public float square(float num) {
			return num * num;
	}}
	public class task1{
	public static void main(String[] args) {
			Mathematics math = new Mathematics();
			System.out.println("Square of 5 (int): " + math.square(5));
			System.out.println("Square of 5.5 (double): " + math.square(5.5));
			System.out.println("Square of 5.5f (float): " + math.square(5.5f));
	}
}
