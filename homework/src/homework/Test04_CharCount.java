package homework;

public class Test04_CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͳ�Ƹ���ĸ���� ˼·�����@Anthony_texter
		String str = "AZaz";
		int[] count = new int[26];         //�洢��ĸ
		for (int i=0; i<str.length();i++) {
			char tmp = str.charAt(i);      //����ȡ����ĸ
			int index;
			if (tmp>=65&& tmp<=90) {
				index = tmp - 65;
				count[index] = count[index]+1;
			}
			if (tmp>=97&& tmp<=122) {
				index = tmp - 97;
				count[index] = count[index]+1;
			}
			
		}
		for (int j=0; j<count.length; j++) {
			if (count[j]!=0) {
				System.out.println((char)(j+65)+"�ĸ���Ϊ:"+count[j]);
			}
		}
		
		}

}
