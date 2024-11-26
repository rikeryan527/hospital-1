package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.Charge;
import org.huhehai.hospital.service.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/charges")
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    // 根据医生姓名获取挂号费用信息
    @GetMapping("/doctor/{doctorName}")
    public ResponseEntity<Charge> getChargeByDoctorName(@PathVariable String doctorName) {
        Charge charge = chargeService.getChargeByDoctorName(doctorName);
        if (charge!= null) {
            return new ResponseEntity<>(charge, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 获取所有挂号费用信息
    @GetMapping("")
    public ResponseEntity<List<Charge>> getAllCharges() {
        List<Charge> charges = chargeService.getAllCharges();
        return new ResponseEntity<>(charges, HttpStatus.OK);
    }
}