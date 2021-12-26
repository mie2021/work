package ch5_6;

public class ReadSaveWordFile implements IReadSaveData {
	public void saveData(String data) {
		System.out.println("将数据保存到了word中");
	}
	public String getData() {
		System.out.println("从word中读取了数据");
		return null;
	}
}