package com.ev.polyarea.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@ToString
@Getter
@Setter
public class RpVertices {
    @Id
    String id;

    @JsonProperty("Charging_stations")

    private List<List<List<Double>>> chargingStations = null;
    @JsonProperty("Charging_stations_available")
    private String chargingStationsAvailable;
    @JsonProperty("Distance_to_nearest_charging_station_(km):")
    private Double distanceToNearestChargingStationKm;
    @JsonProperty("Distance_to_vertices_(km)")
    private List<Double> distanceToVerticesKm = null;
    @JsonProperty("Nearest_charging_station")
    private List<List<Double>> nearestChargingStation = null;
    @JsonProperty("RP_execution_time_(sec)")
    private Double rPExecutionTimeSec;
    @JsonProperty("RP_start_time")
    private String rPStartTime;
    @JsonProperty("Vehicle_id")
    private String vehicleId;
    @JsonProperty("Vertices")
    private List<List<Double>> vertices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
