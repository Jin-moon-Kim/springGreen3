package parking.db;

public class ParkingVO {
	private String plateNum;
	private String driverName;
	private int licenseNum;
	private int driverAddress;
	private String parkingType;
	
	public String getPlateNum() {
		return plateNum;
	}
	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(int licenseNum) {
		this.licenseNum = licenseNum;
	}
	public int getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(int driverAddress) {
		this.driverAddress = driverAddress;
	}
	public String getParkingType() {
		return parkingType;
	}
	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}
	@Override
	public String toString() {
		return "ParkingVO [plateNum=" + plateNum + ", driverName=" + driverName + ", licenseNum=" + licenseNum
				+ ", driverAddress=" + driverAddress + ", parkingType=" + parkingType + "]";
	}
	
}
