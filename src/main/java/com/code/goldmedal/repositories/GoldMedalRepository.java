package com.code.goldmedal.repositories;

import com.code.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
    List<GoldMedal> getByCountryOrderByYearAsc(String country);
    static List<GoldMedal> getByCountryOrderByYearDesc(String country) {
        // TODO Auto-generated method stub
        return null;
    }
    List<GoldMedal> getByCountryOrderBySeasonAsc(String country);
    static List<GoldMedal> getByCountryOrderBySeasonDesc(String country) {
        // TODO Auto-generated method stub
        return null;
    }
    List<GoldMedal> getByCountryOrderByCityAsc(String country);
    static List<GoldMedal> getByCountryOrderByCityDesc(String country) {
        // TODO Auto-generated method stub
        return null;
    }
    List<GoldMedal> getByCountryOrderByNameAsc(String country);
    static List<GoldMedal> getByCountryOrderByNameDesc(String country) {
        // TODO Auto-generated method stub
        return null;
    }
    List<GoldMedal> getByCountryOrderByEventAsc(String country);
    static List<GoldMedal> getByCountryOrderByEventDesc(String country) {
        // TODO Auto-generated method stub
        return null;
    }

    int countByCountry(String country);
    int countBySeason(String season);
    int countByCountryAndGender(String country, String gender);

    List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String country, String season);
    
    

    
}
