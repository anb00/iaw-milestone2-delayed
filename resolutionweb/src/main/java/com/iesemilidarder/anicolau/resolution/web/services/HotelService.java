package com.iesemilidarder.anicolau.resolution.web.services;

import com.iesemilidarder.anicolau.resolution.core.DataHelper;
import com.iesemilidarder.anicolau.resolution.core.data.Hotel;

import java.util.List;

public class HotelService {

    public List<Hotel> getHotels() {
        return DataHelper.getHotels();
    }

}
