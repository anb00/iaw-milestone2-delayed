package com.iesemilidarder.anicolau.resolution.web.services;

import com.iesemilidarder.anicolau.resolution.core.DataHelper;
import com.iesemilidarder.anicolau.resolution.core.data.Activity;

import java.util.List;

public class ActividadesService {
    public List<Activity> getActividades() {
        return DataHelper.getActividades();
    }
}
