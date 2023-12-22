package org.twowheels4u.repository;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.twowheels4u.model.Motorcycle;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long>,
        JpaSpecificationExecutor<Motorcycle> {

    Optional<Motorcycle> findByIdAndDeletedFalse(Long id);

    Page<Motorcycle> findAllByDeletedFalse(Pageable pageable);

    @Modifying
    @Transactional
    @Query("UPDATE Motorcycle m SET m.deleted = true WHERE m.id = :id")
    void safeDelete(Long id);
}
