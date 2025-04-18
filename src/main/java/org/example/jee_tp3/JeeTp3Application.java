package org.example.jee_tp3;

import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class JeeTp3Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {

		SpringApplication.run(JeeTp3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		patientRepository.save(new Patient(null,"mohammed",new Date(),false,34));
		patientRepository.save(new Patient(null,"hanane",new Date(),false,4321));
		patientRepository.save(new Patient(null,"imane",new Date(),true,34));


	}
}


