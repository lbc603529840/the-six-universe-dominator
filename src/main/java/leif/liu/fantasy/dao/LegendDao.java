package leif.liu.fantasy.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import leif.liu.fantasy.entity.Legend;

@Mapper
public interface LegendDao {
    @Insert("INSERT INTO legend(uuid, name, designation, element, ability, status, belong_to, power_score, power_rank, spirit_score, spirit_rank, agility_score, agility_rank, endurance_score, endurance_rank, defense_score, defense_rank, toughness_score, toughness_rank, total_score, total_rank, created_time, created_by, updated_time, updated_by) VALUES (#{uuid}, #{name}, #{designation}, #{element}, #{ability}, #{status}, #{belong_to}, #{power_score}, #{power_rank}, #{spirit_score}, #{spirit_rank}, #{agility_score}, #{agility_rank}, #{endurance_score}, #{endurance_rank}, #{defense_score}, #{defense_rank}, #{toughness_score}, #{toughness_rank}, #{total_score}, #{total_rank}, #{created_time}, #{created_by}, #{updated_time}, #{updated_by})")
    public abstract int insert(Legend legend);
}
