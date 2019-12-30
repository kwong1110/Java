package ncs.test2;

public class StringTest {

	// 주어짂 String 데이터를 “, ”로 분리한 다음 char[] 로 바꾼다.
	// char[] 에서 대문자만 골라서 출력 처리한다. 단, continue 문 사용한다.
	
	public static void main(String args[]) {
		String str = "A, b, c, D, a, B, C, d, f, F";
		
		String[] st = str.split(", ");
//		char[] charSt = str.toCharArray();
		// 스트링을 char 배열로 반환해주는 함수도 있는데...
//		System.out.println(Arrays.toString(charSt));
		
		char[] data = new char[st.length];
		int index = 0;
		for(String i : st) {
			data[index++] = i.charAt(0);
		}
//		int j = 0;
//		for(String i : st) {
//			while(j < st.length) {
//				data[j] = i.charAt(0);
////				System.out.println("data[?]" + data[j]);
//				break;
//			}
//			j++;
//		}
		
		int i = 0;
		while(i < data.length) {
			if(data[i] >= 'a' && data[i] <='z') {
				i++;
				continue;
			}
			System.out.println("data["+ i + "] : " + data[i]);
			i++;
		}
		
//		int i = 0;
//		while(i < data.length) {
//			if(data[i] >= 'A' && data[i] <='Z')
//			System.out.println("data["+ i + "] : " + data[i]);
//			i++;
//		}
	}
}
