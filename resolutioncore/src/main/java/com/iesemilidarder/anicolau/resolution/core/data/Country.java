package com.iesemilidarder.anicolau.resolution.core.data;

import java.util.UUID;

public abstract class Country {
    public UUID getId() {
        return id;
    }

   /* public void setId(UUID id) {
        this.id = id;
    } */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    private UUID id = UUID.randomUUID();
    private String name;
    private String iniciales;
    private String Location;
}
