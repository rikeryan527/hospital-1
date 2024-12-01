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

    public RegistrationListServiceImpl(RegistrationListMapper registrationListMapper) {
        this.registrationListMapper = registrationListMapper;
    }

    @Override
    public List<RegistrationList> getRegistrationListByUserName(String name) {
        return registrationListMapper.getRegistrationListByUserName(name);
    }

    @Override
    public List<RegistrationList> getRegistrationListByAccountName(String accountName) {
        return registrationListMapper.getRegistrationListByAccountName(accountName);
    }

    @Override
    public void addRegistrationList(RegistrationList registrationList) {
        registrationListMapper.addRegistrationList(registrationList);
    }
}