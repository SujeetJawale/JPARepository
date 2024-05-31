package com.sujeet.jparepositorytut.service;

import com.sujeet.jparepositorytut.dao.IVaccineRepository;
import com.sujeet.jparepositorytut.dao.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class VaccineServiceImpl implements IVaccineService{

    @Autowired
    IVaccineRepository repo;

    @Override
    public Vaccine searchVaccineById(Integer id)
    {
        //return repo.getById(id);
        System.out.println("Control in service layer");
        return repo.getReferenceById(id);

    }

    @Override
    public List<Vaccine> searchVaccineByObject(Vaccine vaccine) {
        Example<Vaccine> example = Example.of(vaccine);
        return repo.findAll(example);
    }

    @Override
    public List<Vaccine> searchVaccineByObjectSort(Vaccine vaccine, Sort sort) {
        Example<Vaccine> example = Example.of(vaccine);
        return repo.findAll(example, sort);
    }

    @Override
    public String removeVaccineInfoByIds(Iterable<Integer> ids) {
        List<Vaccine> list = repo.findAllById(ids);
        if(!list.isEmpty()){
            repo.deleteAllByIdInBatch(ids);
            return "deleted all records";
        }
        return "Unable to delete";
    }
}
