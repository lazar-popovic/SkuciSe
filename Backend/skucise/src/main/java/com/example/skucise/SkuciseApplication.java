package com.example.skucise;

import com.example.skucise.database.Test;
import com.example.skucise.modeli.Oglas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class SkuciseApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(SkuciseApplication.class, args);
		
		Test dataBaseTest = new Test();
		ResultSet rs;
		Oglas[] nizOglasa = new Oglas[2];

		rs = dataBaseTest.getAllAdvertisment();

		int i = 0;

		while (rs.next())
		{
			nizOglasa[i] = new Oglas();
			nizOglasa[i].setId(rs.getInt("id"));
			nizOglasa[i].setNaziv(rs.getString("naziv"));
			nizOglasa[i].setOpis(rs.getString("opis"));
			i++;
		}

		for (Oglas oglas: nizOglasa)
		{
			System.out.println(oglas);
		}
	}

}
