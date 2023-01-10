package com.BusReservationSystemO;

import com.BusReservationSystemO.Entity.*;
import java.util.List;

public interface BusService {

    public BusDto createBus(BusDto busDto);

    public BusDto getBusDetails(Long busId);

    public BusDto updateBus(BusDto busDto);

    public void deleteBus(Long busId);

    //new
    List<BusDto> getAllBuses();

    //new


}

