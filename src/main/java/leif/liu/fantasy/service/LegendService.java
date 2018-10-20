package leif.liu.fantasy.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import leif.liu.fantasy.entity.Legend;
import leif.liu.fantasy.exception.ServiceException;

public interface LegendService {
    public abstract int create(Legend legend, MultipartFile multipartFile) throws ServiceException;

    public abstract List<Legend> findAll();
}
