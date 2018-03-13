package pl.sly.apps.sboot.flw.pgres.dckr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.sly.apps.sboot.flw.pgres.dckr.domain.entity.Vehicle;

@RepositoryRestResource
public interface VehicleRepository  extends CrudRepository<Vehicle, Long> {
}