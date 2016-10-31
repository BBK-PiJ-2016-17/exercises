public class ArrayCopierLauncher {

	public static void main(String[] args) {

		int i = 0;
		int shorter = 0;
		int[] src = {3, 4, 5, 6, 7};
		int[] dst = {0, 0, 0, 0};

		ArrayCopier copier = new ArrayCopier();
	
		copier.copy(src, dst);

		if (src.length < dst.length) {

			shorter = src.length;

			System.out.println("\nsrc[] is smaller than dst[]" +
				"\nI'm copying over everything, but there still " +
				(dst.length - src.length) + " space(s) available in dst[].\n");

			// Copy all elements over and leave empty space on dst[]
			for (i = 0; i < src.length; i++) {
				System.out.print("/ " + dst[i] + " /");
			}
		} else if (src.length > dst.length) {

			shorter = dst.length;

			System.out.println("\nsrc[] is bigger than dst[]" +
				"\nI'm only copying over as many elements as dst[] can fit.\n");

			// Only copy as many elements as dst[] can fit
			for (i = 0; i < dst.length; i++) {
				System.out.print("/ " + dst[i] + " /");
			}
		} else if (src.length == dst.length) {

			shorter = src.length; // in this case they are the same

			System.out.println("\nsrc[] and dst[] are of equal length." +
				"\nI'm copying over everything.\n");

			// Duplicate
			for (i = 0; i < dst.length; i++) {
				System.out.print("/ " + dst[i] + " /");
			}
		}
 	}
}