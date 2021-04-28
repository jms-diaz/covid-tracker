package io.diaz.covidtracker.controllers;

import io.diaz.covidtracker.models.LocationStats;
import io.diaz.covidtracker.sevices.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = covidDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(LocationStats::getTotalReportedCases).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("latestReportedCases", totalCases);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        model.addAttribute("description", "This application lists the current number of COVID cases reported around the world. Made using SpringBoot and Bootstrap.");
        model.addAttribute("about", "Made by James Diaz");
        return "about";
    }
}
