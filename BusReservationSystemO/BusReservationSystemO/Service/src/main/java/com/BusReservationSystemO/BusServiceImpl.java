package com.BusReservationSystemO;
import com.BusReservationSystemO.exceptions.*;
import com.BusReservationSystemO.Entity.*;
import com.BusReservationSystemO.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Override
    public BusDto createBus(BusDto busDto) {
        BusDto bus = busRepository.save(busDto);
        return bus;
    }
    //new
    @Override
    public List<BusDto> getAllBuses() {
        return busRepository.findAll().stream().collect(Collectors.toList());
    }

    //new

    @Override
    public BusDto getBusDetails(Long busId) {
        Optional<BusDto> busDetails = busRepository.findById(busId);
        if(!busDetails.isPresent()){
            throw new CustomException("No Record Found");
        }
        return busDetails.get();
    }


    @Override
    public BusDto updateBus(BusDto busDto) {
        try {
            BusDto busObj = busRepository.findById(busDto.getId()).get();

            if (null == busObj) {
                throw new CustomException("No Record Found");
            }
            return busRepository.save(busDto);
        } catch (Exception e) {
            throw new CustomException("Error while Updating Record");
        }
    }
    @Override
    public void deleteBus(Long busId) {
        try {
            BusDto busObj=busRepository.findById(busId).get();

            if(null==busObj) {
                throw new CustomException("No Record Found");
            }
            busRepository.delete(busObj);
        }
        catch(Exception e) {
            throw new CustomException("Unable to delete Record");
        }
    }

}
