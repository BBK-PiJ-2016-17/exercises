public class ArrayCopier {

	private int[] src;
	private int[] dst = {0, 0, 0, 0, 0};
	private int i = 0;
	private int shorter = 0; // get the shorter index to loop over

	public int[] copy(int[] src, int[] dst) {

		this.src = src;
		this.dst = dst;
		// this.shorter = shorter;

		// get the shorter number?
		for (i = 0; i < shorter; i++) {

			dst[i] = src[i];
		}

		// dst[0] = src[0];
		// dst[1] = src[1];
		// dst[2] = src[2];
		// dst[3] = src[3];
		// dst[4] = src[4];

		return dst;

	}
}