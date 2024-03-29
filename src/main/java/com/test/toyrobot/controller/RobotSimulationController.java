package com.test.toyrobot.controller;

import com.test.toyrobot.model.Report;
import com.test.toyrobot.model.SimulationRound;
import com.test.toyrobot.service.RobotSimulationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotSimulationController {

    private RobotSimulationService simulationService;

    @Autowired
    public RobotSimulationController(RobotSimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping
    @RequestMapping("/robot/simulation")
    public ResponseEntity<Report> newSimulationRound(@RequestBody SimulationRound simulationRound) {
        Report report = simulationService.start(simulationRound);
        return ResponseEntity.ok(report);
    }
}


