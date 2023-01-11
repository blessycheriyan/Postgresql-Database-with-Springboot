package com.company.SpringWithPostgresql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User,Integer> {

}
