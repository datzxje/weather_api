package com.cloudapi.weatherforecast.location;

import com.cloudapi.weatherforecast.common.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, String> {
}
