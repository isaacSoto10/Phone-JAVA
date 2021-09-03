package phone;

public interface Ringable {
	public default String ring(){
		return "RING RINGGGGG";
	}
	public default String unlock() {
		return "YOUR PHONE IS UNLOCKED SIRRRRR";
	}
}
