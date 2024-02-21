package com.musala.dronedispatcher.Drone.dto;
import com.musala.dronedispatcher.Drone.domain.enums.Model;
import com.musala.dronedispatcher.Drone.domain.enums.State;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DroneDto {
  @Size(min =  1, max =  100)
  private String serialNumber;

  @Min(0)
  @Max(500)
  private Integer weight;

  @Min(0)
  @Max(100)
  private Integer capacity;

  @Enumerated(EnumType.STRING)
  private State state;

  @Enumerated(EnumType.STRING)
  private Model model;
}
