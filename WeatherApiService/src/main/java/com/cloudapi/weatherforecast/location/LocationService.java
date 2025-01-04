package com.cloudapi.weatherforecast.location;

import com.cloudapi.weatherforecast.common.Location;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private LocationRepository repo;

    public LocationService(LocationRepository repo) {
        super();
        this.repo = repo;
    }

    public Location add(Location location) {
        return repo.save(location);
    }

}
