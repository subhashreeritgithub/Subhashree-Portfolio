package in.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.ContactUsEntity;

public interface ContactUsRepo extends JpaRepository <ContactUsEntity,Integer> {

}
