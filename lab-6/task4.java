 class Tree {
	private int height;

	public Tree() {
			this.height = 0;
	}

	public Tree(int height) {
			this.height = height;
	}

	public void info(String message) {
			System.out.println(message + " Height: " + height);
	}

	public void info() {
			System.out.println("Height: " + height);
	}}
	public class task4{

	public static void main(String[] args) {
			Tree tree1 = new Tree();
			Tree tree2 = new Tree(10);

			tree1.info("Tree 1 info:");   
			tree2.info();                
	}
}
