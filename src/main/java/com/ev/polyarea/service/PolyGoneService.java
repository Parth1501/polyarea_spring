package com.ev.polyarea.service;

import com.ev.polyarea.model.RpVertices;

public interface PolyGoneService {
    RpVertices save(double lat, double lon, RpVertices vertices);
    RpVertices getData(double lat, double lon, double soc);
    void delete(double lat,double lon);
    void deleteAll();

}
