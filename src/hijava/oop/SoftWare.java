package hijava.oop;

public abstract class SoftWare {
	
	public abstract void plan();
	public abstract void develope();
	public abstract void release();

	void process() {
		plan();
		develope();
		release();
	}
}
