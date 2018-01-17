package Herencia;

public class Principal {
		private int x;
		private int y;
		public Principal(int x, int y) {
			this.x = x;
			this.y = y;	

	}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	public void imprimir() {
		System.out.println("imprimir valores"+x+y);
	}

}
