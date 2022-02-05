package com.ev.polyarea.service.impl;

import com.ev.polyarea.model.RpVertices;
import com.ev.polyarea.repository.PolyGoneSqlRepo;
import com.ev.polyarea.service.PolyGoneService;
import com.ev.polyarea.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolyGoneServiceImpl implements PolyGoneService {
    
    @Autowired
    PolyGoneSqlRepo repo;
    
    @Override
    public RpVertices save(double lat, double lon, RpVertices vertices) {
        vertices.setId(Util.buildKey(lat,lon));
        repo.save(vertices);
        return vertices;
    }

    @Override
    public RpVertices getData(double lat, double lon, double soc) {
        return repo.findById(Util.buildKey(lat,lon)).orElse(new RpVertices());
    }

    @Override
    public void delete(double lat, double lon) {
        repo.deleteById(Util.buildKey(lat,lon));
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }


}
