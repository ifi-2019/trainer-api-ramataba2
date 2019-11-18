package com.ifi.trainer_api.repository;

import com.ifi.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainerRepository extends CrudRepository<Trainer,String> {

    Trainer findByName(String name);
    //Trainer orElse(Trainer t);
}
