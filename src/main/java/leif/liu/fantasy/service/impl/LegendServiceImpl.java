package leif.liu.fantasy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import leif.liu.fantasy.dao.LegendDao;
import leif.liu.fantasy.entity.Legend;
import leif.liu.fantasy.exception.ServiceException;
import leif.liu.fantasy.service.LegendService;
import leif.liu.fantasy.util.MyUtil;

@Service
public class LegendServiceImpl implements LegendService {
    @Autowired
    private LegendDao legendDao;

    @Override
    public int create(Legend legend, MultipartFile multipartFile) throws ServiceException {
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

        if (StringUtils.isEmpty(legend.getName()) || StringUtils.isEmpty(legend.getDesignation()) || StringUtils.isEmpty(legend.getElement()) || StringUtils.isEmpty(legend.getAbility()) || StringUtils.isEmpty(legend.getBelong_to())) {
            throw new ServiceException("请完善数据！");
        }

        if (!multipartFile.isEmpty()) {
            MyUtil.uploadFile(multipartFile, legend.getUuid() + ".jpg", "/the-six-universe-dominator/legend/");
        }

        return legendDao.insert(legend);
    }

    @Override
    public List<Legend> findAll() {
        return legendDao.selectAll();
    }
}
