package com.dongkyeom.trajectory.processor.gps.persistence.repository;

import com.dongkyeom.trajectory.processor.gps.domain.GPS;

public interface GPSRepository {

    void save(GPS gps);

    GPS findByIdOrElseThrow(String tripId);
}
