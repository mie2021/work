/*
 * ҵ����BusinessB����Ҫ�õ���д���ݵĹ��ܣ�
 * ���ݿ��ܱ��������ݿ��С��ı��ļ��С�Excel�ļ��С�
 * Ҳ�п������ӱ��������Դ
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
	//ҵ�񷽷����������ݣ����浽������ʵ�ʵĶ���iReadSaveData����
	public void saveData(String data) {
		iReadSaveData.saveData(data);
	}
	//ҵ�񷽷�����ȡ���ݣ��������ȡ��ʵ�ʵĶ���iReadSaveData����
		public String readData() {
		return iReadSaveData.getData();
	}
}