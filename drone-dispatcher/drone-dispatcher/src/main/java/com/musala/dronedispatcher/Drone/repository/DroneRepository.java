package com.musala.dronedispatcher.Drone.repository;

import com.musala.dronedispatcher.Drone.domain.Drone;
import com.musala.dronedispatcher.Drone.domain.enums.State;
import com.musala.dronedispatcher.Drone.dto.DroneDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DroneRepository extends JpaRepository<Drone, String>{
  List<Drone>  getAllDrones();

  Integer getCapacityForSerial(String serialNumber);

  List<Drone>  getDroneByState(State state);

  Drone registerDrone(DroneDto droneDto);

}
