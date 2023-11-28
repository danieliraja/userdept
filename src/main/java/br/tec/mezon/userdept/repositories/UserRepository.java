package br.tec.mezon.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.tec.mezon.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
