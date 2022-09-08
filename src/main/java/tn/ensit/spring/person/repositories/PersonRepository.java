package tn.ensit.spring.person.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ensit.spring.person.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
