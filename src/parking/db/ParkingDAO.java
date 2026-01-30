package parking.db;

import java.sql.SQLException;

public class ParkingDAO extends DBConn{
	ParkingVO vo = null;

	public ParkingVO getCarByPlateNum(String plateNum) {
		vo = new ParkingVO();
		
		try {
			sql = "SELECT * FROM j_parking_manager WHERE plate_number = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, plateNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setPlateNum(plateNum);
				vo.setDriverName(rs.getString("driver_name"));
				vo.setLicenseNum(rs.getInt("license_number"));
				vo.setDriverAddress(rs.getInt("driver_address"));
				vo.setParkingType(rs.getString("parking_type"));
			}
		} catch (SQLException e) {
			System.out.println("SQL error : " + e.getMessage());
		}	finally {
			rsClose();
	}
		return vo;
	}
	
	public int upsertCarInfo(ParkingVO vo) {
		int res = 0;
		try {
			sql = "INSERT INTO j_parking_manager (plate_number, driver_name, license_number, driver_address, parking_type) VALUES (?, ?, ?, ?, ?) " +
          "ON DUPLICATE KEY UPDATE driver_name = VALUES(driver_name), license_number = VALUES(license_number), driver_address = VALUES(driver_address), parking_type = VALUE(Sparking_type))";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPlateNum());
			pstmt.setString(2, vo.getDriverName());
			pstmt.setInt(3, vo.getLicenseNum());
			pstmt.setInt(4, vo.getDriverAddress());
			pstmt.setString(5, vo.getParkingType());
			
		} catch (SQLException e) {
			System.out.println("SQL error : " + e.getMessage());
		} finally {
				pstmtClose();
		}
		
		return res;
	}
}