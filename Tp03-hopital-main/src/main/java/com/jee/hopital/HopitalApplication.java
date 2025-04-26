package com.jee.hopital;

import com.jee.hopital.entities.Patient;
import com.jee.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		patientRepository.save(new Patient(null, "A", new Date(), false, 34f));

		patientRepository.save(new Patient(null, "B", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "C", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "D", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "E", new Date(), false, 34f));



	}
}
