package org.bonitasoft.watch.springboot.repository;

import org.bonitasoft.watch.springboot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
