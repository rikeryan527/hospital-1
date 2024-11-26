package org.huhehai.hospital.mapper;

import java.util.List;
import org.huhehai.hospital.entity.RegistrationList;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationListMapper {
    List<RegistrationList> getRegistrationListByUserName(String name);
    void addRegistrationList(RegistrationList registrationList);
}