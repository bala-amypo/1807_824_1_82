package com.example.demo.controller;

import com.example.demo.model.TeamSummaryRecord;
import com.example.demo.service.TeamSummaryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/team-summaries")
@Tag(name = "Team Summaries")
public class TeamSummaryController {

    private final TeamSummaryService service;

    public TeamSummaryController(TeamSummaryService service) {
        this.service = service;
    }

    /**
     * POST /api/team-summaries/generate
     * Generate summary for a team on a given date
     */
    @PostMapping("/generate")
    public TeamSummaryRecord generateSummary(
            @RequestParam String teamName,
            @RequestParam LocalDate summaryDate) {

        return service.generateSummary(teamName, summaryDate);
    }

    /**
     * GET /api/team-summaries/team/{teamName}
     * Get summaries by team name
     */
    @GetMapping("/team/{teamName}")
    public List<TeamSummaryRecord> getByTeam(
            @PathVariable String teamName) {

        return service.getSummariesByTeam(teamName);
    }

    /**
     * GET /api/team-summaries/{id}
     * Get summary by ID
     */
    @GetMapping("/{id}")
    public TeamSummaryRecord getById(@PathVariable Long id) {
        return service.getSummaryById(id);
    }

    /**
     * GET /api/team-summaries
     * Get all summaries
     */
    @GetMapping
    public List<TeamSummaryRecord> getAll() {
        return service.getAllSummaries();
    }
}
