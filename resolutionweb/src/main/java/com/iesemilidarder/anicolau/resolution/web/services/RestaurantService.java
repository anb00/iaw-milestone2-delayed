package com.iesemilidarder.anicolau.resolution.web.services;

import com.iesemilidarder.anicolau.resolution.core.DataHelper;
import com.iesemilidarder.anicolau.resolution.core.data.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RestaurantService {

    public List<Restaurant> getRestaurants() {
        return DataHelper.getRestaurantes();
    }


}
