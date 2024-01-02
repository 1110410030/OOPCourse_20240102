package npu.classroom;

public class PcRoom {
		
	private int PcAmounts;
	private String PcOs;
	
	public int getPcAmounts() {
		return PcAmounts;
	}
	public void setPcAmounts(int pcAmounts) {
		PcAmounts = pcAmounts;
	}
	public String getPcOs() {
		return PcOs;
	}
	public void setPcOs(String pcOs) {
		PcOs = pcOs;
	}

	public PcRoom() {}
	public PcRoom(int PcAmounts,String PcOs) {
	     this.setPcAmounts(PcAmounts);
	     this.setPcOs(PcOs);
	}
	
	@Override
	public String toString() {
		return "PcRoom [PcAmounts=" + PcAmounts + ", PcOs=" + PcOs + "]";
	}
	
}
