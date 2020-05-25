package Ch08;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {10, 20, 30, 40, 50};
		int count, size;
		
		count = aa.length;
		size = count * Integer.BYTES;
		
		System.out.printf("배열 aa[]의 요소의 개수 %d 개 입니다.", count);
		System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다.", size);
	}

}
