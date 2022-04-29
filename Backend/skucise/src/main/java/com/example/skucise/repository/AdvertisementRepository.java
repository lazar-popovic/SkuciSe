package com.example.skucise.repository;

import com.example.skucise.database.Test;
import com.example.skucise.modeli.Oglas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class AdvertisementRepository
{
    Test test = new Test();

    public List<Oglas> gettAllAdvertisiment() throws SQLException {
        ResultSet rs;
        LinkedList<Oglas> listaOglasa = new LinkedList<>();

        rs = test.getAllAdvertisment();

        while (rs.next())
        {
            Oglas oglas = new Oglas();
            oglas.setId(rs.getInt("id"));
            oglas.setNaziv(rs.getString("naziv"));
            oglas.setOpis(rs.getString("opis"));

            listaOglasa.add(oglas);
        }

        return listaOglasa;
    }
}
