package org.generation.italy.demo.repo;

import org.generation.italy.demo.pojo.Promozione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PromozioneRepo extends JpaRepository<Promozione, Integer> {

}
