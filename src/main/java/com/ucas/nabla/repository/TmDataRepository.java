package com.ucas.nabla.repository;

import com.ucas.nabla.entity.TmData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TmDataRepository extends JpaRepository<TmData, String> {
    // <current data type, Main key (fn) type>
    // an empty interface here is ready to use.
    // CRUD methods are implemented by JPA. No need to write SQL.
    // except for some unique function (e.g., findByName...)
    // one can define customized method (obey the naming convention),
    // JPA will automatically implement it.
    List<TmData> findBySat(String sat);
}
