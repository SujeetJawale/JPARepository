package com.sujeet.jparepositorytut;

import com.sujeet.jparepositorytut.dao.Vaccine;
import com.sujeet.jparepositorytut.service.IVaccineService;
import com.sujeet.jparepositorytut.service.VaccineServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.domain.Sort.Direction.ASC;

@SpringBootApplication
public class JpaRepositoryTutApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(JpaRepositoryTutApplication.class, args);
        IVaccineService service = container.getBean(VaccineServiceImpl.class);
        String sortDirection = "ASC";

//        Vaccine v = service.searchVaccineById(1);
//        System.out.println(v.toString());

//        Vaccine vc = new Vaccine("Covaxin" , "BharatBio", 945);
//        service.searchVaccineByObject(vc).forEach(System.out::println);

//        Vaccine vc = new Vaccine();
//        vc.setVaccineCompany("BharatBio");
//
//        Sort.Direction direction = Sort.Direction.fromString(sortDirection);
//        String sortField = "vaccine_name";
//        Sort sort = Sort.by(direction, sortField);
//
//        List<Vaccine> list = service.searchVaccineByObjectSort(vc, sort);
//        list.forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);

        String s = service.removeVaccineInfoByIds(list2);
        System.out.println(s);

    }

}
