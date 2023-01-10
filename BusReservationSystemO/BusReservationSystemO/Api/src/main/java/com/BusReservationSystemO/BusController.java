package com.BusReservationSystemO;

import com.BusReservationSystemO.exceptions.*;
import com.BusReservationSystemO.Entity.BusDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/busroutes")
public class BusController {

    @Autowired
    private BusService busService;

    @PostMapping
    public ResponseEntity<?> createbus(@Validated @RequestBody BusDto busDto){

        BusDto busDetails=busService.createBus(busDto);
        return new ResponseEntity<>(busDetails, HttpStatus.CREATED);
    }
    @GetMapping("/{busId}")
    public ResponseEntity<?> getbus(@PathVariable(required=true)Long  busId){
        BusDto busDetails=busService.getBusDetails(busId);

        return new ResponseEntity<>(busDetails,HttpStatus.OK);
    }
    //new
    @GetMapping
    public ResponseEntity<?> getAllBuses() {
        List<BusDto> allBuses = busService.getAllBuses();
        return new ResponseEntity<>(allBuses, HttpStatus.OK);
    }



    //new


    @PutMapping
    public ResponseEntity<?> updateBus(@Validated @RequestBody BusDto busDto){
        if(null==busDto.getId() || busDto.getId()<=0){
            throw new CustomException("Invalid Id");
        }
        BusDto busDetails=busService.updateBus(busDto);
        return new ResponseEntity<>(busDetails,HttpStatus.OK);
    }

    @DeleteMapping("/{busId}")
    public ResponseEntity<?> deleteBus(@PathVariable(required=true)Long busId){
        try {
            if (busId <= 0) {
                throw new CustomException("Invalid Id");
            }
            busService.deleteBus(busId);
        }
        catch(Exception e) {
            throw new CustomException("Error While Deleting Record");
        }
        Map<String,Object> map=new HashMap<>();
        map.put("message","Record Deleted Successfully ID :: "+busId);

        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }
}


