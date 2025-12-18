package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.TeamSummaryRecord;
import com.example.demo.service.TeamSummaryService;

@RestController
@RequestMapping("/api/team-summaries")
public class TeamSummaryController {

    @Autowired
    TeamSummaryService service;

   
    @PostMapping("/generate")
    public TeamSummaryRecord generateSummary(
            @RequestParam String teamName,
            @RequestParam String summaryDate
    ) {
        LocalDate date = LocalDate.parse(summaryDate);
        return service.generateSummary(teamName, date);
    }

    
    @GetMapping("/team/{teamName}")
    public List<TeamSummaryRecord> getByTeam(@PathVariable String teamName) {
        return service.getSummariesByTeam(teamName);
    }

    
    @GetMapping("/{id}")
    public TeamSummaryRecord getById(@PathVariable Long id) {
        return service.getAllSummaries()
                .stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    
    @GetMapping
    public List<TeamSummaryRecord> getAllSummaries() {
        return service.getAllSummaries();
    }
}
