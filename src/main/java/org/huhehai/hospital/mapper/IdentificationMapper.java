package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.Identification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdentificationMapper {
    Identification getIdentificationByUserName(String user_name);
    List<Identification> getAllIdentifications();
}