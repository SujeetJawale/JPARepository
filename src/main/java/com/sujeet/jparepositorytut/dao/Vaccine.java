package com.sujeet.jparepositorytut.dao;

import jakarta.persistence.*;

@Entity
@Table(name="VaccineInfo")
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String vaccineName;

    private String vaccineCompany;

    private Integer cost;

    public Vaccine(String vaccineName, String vaccineCompany, Integer cost) {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.cost = cost;
    }

    public Vaccine() {

    }

    public Integer getId() {
        return id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCompany() {
        return vaccineCompany;
    }

    public void setVaccineCompany(String vaccineCompany) {
        this.vaccineCompany = vaccineCompany;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCompany='" + vaccineCompany + '\'' +
                ", cost=" + cost +
                '}';
    }
}
