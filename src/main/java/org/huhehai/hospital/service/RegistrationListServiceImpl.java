package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.RegistrationList;
import org.huhehai.hospital.mapper.RegistrationListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationListServiceImpl implements RegistrationListService {

    @Autowired
    private RegistrationListMapper registrationListMapper;

    @Override
    public List<RegistrationList> getRegistrationListByUserName(String name) {
        return registrationListMapper.getRegistrationListByUserName(name);
    }

    @Override
    public void addRegistrationList(RegistrationList registrationList) {
        registrationListMapper.addRegistrationList(registrationList);
    }
}