public class Charge {
	private static final double k=8.99e09;
	private final double rx;
	private final double ry;
	private final double q;
	public Charge(double x0,double y0,double q0) {
		// TODO Auto-generated constructor stub
		this.rx=x0;
		this.ry=y0;
		this.q=q0;
		}
	public double potentialAt(double x,double y) {
		double dx=x-rx;
		double dy=y-ry;
		return k*q/Math.sqrt(dx*dx+dy*dy);
			
	}
	public static void main(String[] args) {
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		Charge c1=new Charge(0.51,0.63,21.3);
		Charge c2=new Charge(0.13,0.94,81.9);
		double v1=c1.potentialAt(x, y);
		double v2=c2.potentialAt(x, y);
		System.out.println("%.2e\n"+(v1+v2));	
	}
	

}
