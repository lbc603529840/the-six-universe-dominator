package leif.liu.fantasy.service;

import java.util.List;

import leif.liu.fantasy.entity.Legend;
import leif.liu.fantasy.exception.ServiceException;

public interface LegendService {
    public abstract int create(Legend legend) throws ServiceException;

    public abstract List<Legend> findAll();
}
