package leif.liu.fantasy.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import leif.liu.fantasy.entity.Legend;
import leif.liu.fantasy.entity.User;
import leif.liu.fantasy.exception.ServiceException;
import leif.liu.fantasy.service.LegendService;

@Controller
@RequestMapping("/legend")
@SessionAttributes("user")
public class LegendController {
    @Autowired
    private LegendService legendService;

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestParam(name = "name") String name,
                         @RequestParam(name = "designation") String designation,
                         @RequestParam(name = "element") String element,
                         @RequestParam(name = "ability") String ability,
                         @RequestParam(name = "belongTo") String belongTo,
                         @RequestParam(name = "powerScore") int powerScore,
                         @RequestParam(name = "spiritScore") int spiritScore,
                         @RequestParam(name = "agilityScore") int agilityScore,
                         @RequestParam(name = "enduranceScore") int enduranceScore,
                         @RequestParam(name = "defenseScore") int defenseScore,
                         @RequestParam(name = "toughnessScore") int toughnessScore,
                         @ModelAttribute("user") User userInSession) {
        try {
            legendService.create(new Legend(UUID.randomUUID().toString(), StringUtils.trimWhitespace(name), StringUtils.trimWhitespace(designation), StringUtils.trimWhitespace(element), StringUtils.trimWhitespace(ability), 1, StringUtils.trimWhitespace(belongTo), powerScore, null, spiritScore, null, agilityScore, null, enduranceScore, null, defenseScore, null, toughnessScore, null, 0, null, null, userInSession.getNickname(), null, userInSession.getNickname()));
        } catch (ServiceException serviceException) {
            return serviceException.getServiceExceptionMessage();
        }

        return "success";
    }

    @GetMapping("/findAll")
    @ResponseBody
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("legend");
        modelAndView.addObject("legendList", legendService.findAll());
        return modelAndView;
    }
}
