package ncs.test2;

public class StringTest {

	// �־ String �����͸� ��, ���� �и��� ���� char[] �� �ٲ۴�.
	// char[] ���� �빮�ڸ� ��� ��� ó���Ѵ�. ��, continue �� ����Ѵ�.
	
	public static void main(String args[]) {
		String str = "A, b, c, D, a, B, C, d, f, F";
		
		String[] st = str.split(", ");
//		char[] charSt = str.toCharArray();
		// ��Ʈ���� char �迭�� ��ȯ���ִ� �Լ��� �ִµ�...
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
