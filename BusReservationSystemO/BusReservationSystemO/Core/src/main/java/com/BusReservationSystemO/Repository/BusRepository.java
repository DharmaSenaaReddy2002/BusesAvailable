package com.BusReservationSystemO.Repository;

import com.BusReservationSystemO.Entity.BusDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusDto, Long> {


}
