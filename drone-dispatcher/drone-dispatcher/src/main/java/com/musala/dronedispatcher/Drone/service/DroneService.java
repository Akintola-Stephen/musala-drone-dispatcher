package com.musala.dronedispatcher.Drone.service;

import com.musala.dronedispatcher.Drone.domain.Drone;
import com.musala.dronedispatcher.Drone.domain.enums.State;
import com.musala.dronedispatcher.Drone.dto.DroneDto;
import com.musala.dronedispatcher.Drone.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class DroneService implements DroneRepository {

  @Autowired
  DroneRepository droneRepository;


  @Override
  public List<Drone> getAllDrones() {
    return droneRepository.getAllDrones();
  }

  @Override
  public Integer getCapacityForSerial(String serialNumber) {
    return droneRepository.getCapacityForSerial(serialNumber);
  }

  @Override
  public List<Drone> getDroneByState(State state) {
    return droneRepository.getDroneByState(state);
  }

  @Override
  public Drone registerDrone(DroneDto droneDto) {
    return droneRepository.registerDrone(droneDto);
  }

}
