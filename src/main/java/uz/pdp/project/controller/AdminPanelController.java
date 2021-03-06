package uz.pdp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.pdp.project.entity.AdminPanel;
import uz.pdp.project.entity.Product;
import uz.pdp.project.payload.Result;
import uz.pdp.project.service.AdminPanelService;
import uz.pdp.project.service.NotificationService;

@RestController
@RequestMapping("/adminpanel")
public class AdminPanelController {

    @Autowired
    AdminPanelService adminPanelService;

    @PostMapping
    public Result addNotificationDate(AdminPanel adminPanel) {
        return adminPanelService.addNotificationDate(adminPanel);
    }
}
