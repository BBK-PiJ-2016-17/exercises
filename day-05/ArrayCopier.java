public class ArrayCopier {

	private int[] src;
	private int[] dst = {0, 0, 0, 0, 0};

	public int[] copy(int[] src, int[] dst) {

		this.src = src;
		this.dst = dst;

		dst[0] = src[0];
		dst[1] = src[1];
		dst[2] = src[2];
		dst[3] = src[3];
		dst[4] = src[4];

		return dst;

	}
}