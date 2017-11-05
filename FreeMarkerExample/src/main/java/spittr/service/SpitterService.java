package spittr.service;


import spittr.entity.Spitter;

public interface SpitterService {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);
  
}
