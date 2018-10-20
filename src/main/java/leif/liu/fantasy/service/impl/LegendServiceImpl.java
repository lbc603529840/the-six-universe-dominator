package leif.liu.fantasy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leif.liu.fantasy.dao.LegendDao;
import leif.liu.fantasy.entity.Legend;
import leif.liu.fantasy.service.LegendService;
import leif.liu.fantasy.util.MyUtil;

@Service
public class LegendServiceImpl implements LegendService {
    @Autowired
    private LegendDao legendDao;

    @Override
    public int create(Legend legend) {
        legend.setPower_rank(MyUtil.getRankByScore(legend.getPower_score()));
        legend.setSpirit_rank(MyUtil.getRankByScore(legend.getSpirit_score()));
        legend.setAgility_rank(MyUtil.getRankByScore(legend.getAgility_score()));
        legend.setEndurance_rank(MyUtil.getRankByScore(legend.getEndurance_score()));
        legend.setDefense_rank(MyUtil.getRankByScore(legend.getDefense_score()));
        legend.setToughness_rank(MyUtil.getRankByScore(legend.getToughness_score()));
        int totalScore = MyUtil.getTotalScore(legend.getPower_score(), legend.getSpirit_score(), legend.getAgility_score(), legend.getEndurance_score(), legend.getDefense_score(), legend.getToughness_score());
        legend.setTotal_score(totalScore);
        legend.setTotal_rank(MyUtil.getRankByScore(totalScore));
        legend.setCreated_time(MyUtil.getCurrentDate());
        legend.setUpdated_time(MyUtil.getCurrentDate());
        return legendDao.insert(legend);
    }
}
