package com.ev.polyarea.repository;

import com.ev.polyarea.model.RpVertices;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PolyGoneSqlRepo extends MongoRepository<RpVertices, String> {
}
