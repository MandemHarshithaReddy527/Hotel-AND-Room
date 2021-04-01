/*package com.cg.hbm.service;
import java.util.List;
import com.cg.hbm.entites.Hotel;
import com.cg.hbm.exceptions.HotelNotFoundException;
/**
 * 
 * @author Harshitha
 *
 */
/*public interface IHotelService {
	/**
	 * 
	 * @param hotel
	 * @return int
	 * @throws HotelNotFoundException
	 */
	/*public Hotel addHotel(Hotel hotel) throws HotelNotFoundException ;
	public Hotel updateHotel(Hotel hotel)throws HotelNotFoundException;
	public Hotel removeHotel(int hotel_id) throws HotelNotFoundException;
	public List<Hotel> showAllHotels()throws HotelNotFoundException;
	Hotel showHotel(int hotel_id) throws HotelNotFoundException;

	
	
}*/
package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.Hotel;

public interface IHotelService {
	public Hotel addHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public Hotel removeHotel(Hotel hotel);
	public List<Hotel> showAllHotels();
	public Hotel showHotel(int hotel_id);
}

	
	
	


