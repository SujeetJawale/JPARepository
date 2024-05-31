package com.sujeet.jparepositorytut.service;

import com.sujeet.jparepositorytut.dao.Vaccine;
import org.springframework.data.domain.Sort;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface IVaccineService {
    public Vaccine searchVaccineById(Integer id);
    public List<Vaccine> searchVaccineByObject(Vaccine vaccine);
    public List<Vaccine> searchVaccineByObjectSort(Vaccine vaccine, Sort sort);
    public String removeVaccineInfoByIds(Iterable<Integer> ids);
}
