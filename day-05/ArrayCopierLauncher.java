public class ArrayCopierLauncher {

	public static void main(String[] args) {

		int i = 0;
		int[] src = {3, 4, 5, 6, 7};
		int[] dst = {0, 0, 0, 0, 0};

		ArrayCopier copier = new ArrayCopier();
	
		copier.copy(src, dst);

		for (i = 0; i < 5; i++) {
			System.out.print(dst[i] + ", ");
		}
	}
}