package com.test.web.repository;

import com.test.web.model.Massage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MassageRepository extends JpaRepository<Massage, Long> {
}
