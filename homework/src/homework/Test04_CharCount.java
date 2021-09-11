package homework;

public class Test04_CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//统计各字母个数 思路借鉴于@Anthony_texter
		String str = "AZaz";
		int[] count = new int[26];         //存储字母
		for (int i=0; i<str.length();i++) {
			char tmp = str.charAt(i);      //依次取出字母
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
				System.out.println((char)(j+65)+"的个数为:"+count[j]);
			}
		}
		
		}

}
