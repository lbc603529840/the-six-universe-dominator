package leif.liu.fantasy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import leif.liu.fantasy.entity.Legend;

@Mapper
public interface LegendDao {
    @Insert("INSERT INTO legend(uuid, name, designation, element, ability, status, belong_to, power_score, power_rank, spirit_score, spirit_rank, agility_score, agility_rank, endurance_score, endurance_rank, defense_score, defense_rank, toughness_score, toughness_rank, total_score, total_rank, created_time, created_by, updated_time, updated_by) VALUES (#{uuid}, #{name}, #{designation}, #{element}, #{ability}, #{status}, #{belong_to}, #{power_score}, #{power_rank}, #{spirit_score}, #{spirit_rank}, #{agility_score}, #{agility_rank}, #{endurance_score}, #{endurance_rank}, #{defense_score}, #{defense_rank}, #{toughness_score}, #{toughness_rank}, #{total_score}, #{total_rank}, #{created_time}, #{created_by}, #{updated_time}, #{updated_by})")
    public abstract int insert(Legend legend);

    @Select("SELECT * FROM legend ORDER BY total_score DESC")
    public abstract List<Legend> selectAll();
}
