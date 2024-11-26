package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.RegistrationList;
import java.util.List;

public interface RegistrationListService {
    List<RegistrationList> getRegistrationListByUserName(String name);
    void addRegistrationList(RegistrationList registrationList);
}