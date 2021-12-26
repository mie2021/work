/*
 * 业务类BusinessB，需要用到读写数据的功能，
 * 数据可能保存在数据库中、文本文件中、Excel文件中、
 * 也有可能增加别的数据来源
 */
package ch5_6;

public class BusinessB {
	private IReadSaveData iReadSaveData;
	public IReadSaveData getiReadSaveData() {
		return iReadSaveData;
	}
	public void setiReadSaveData(IReadSaveData iReadSaveData) {
		this.iReadSaveData = iReadSaveData;
	}
	public BusinessB(IReadSaveData iReadSaveData) {
		this.iReadSaveData = iReadSaveData;
	}
	//业务方法，保存数据，保存到哪里由实际的对象iReadSaveData决定
	public void saveData(String data) {
		iReadSaveData.saveData(data);
	}
	//业务方法，读取数据，从哪里读取由实际的对象iReadSaveData决定
		public String readData() {
		return iReadSaveData.getData();
	}
}