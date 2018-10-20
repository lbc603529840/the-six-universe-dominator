package leif.liu.fantasy.entity;

public class Legend {
    private String uuid;
    private String name;
    private String designation;
    private String element;
    private String ability;
    private int status;
    private String belong_to;
    private int power_score;
    private String power_rank;
    private int spirit_score;
    private String spirit_rank;
    private int agility_score;
    private String agility_rank;
    private int endurance_score;
    private String endurance_rank;
    private int defense_score;
    private String defense_rank;
    private int toughness_score;
    private String toughness_rank;
    private int total_score;
    private String total_rank;
    private String created_time;
    private String created_by;
    private String updated_time;
    private String updated_by;

    public Legend() {}

    public Legend(String uuid, String name, String designation, String element, String ability, int status, String belong_to, int power_score, String power_rank, int spirit_score, String spirit_rank, int agility_score, String agility_rank, int endurance_score, String endurance_rank, int defense_score, String defense_rank, int toughness_score, String toughness_rank, int total_score, String total_rank, String created_time, String created_by, String updated_time, String updated_by) {
        this.uuid = uuid;
        this.name = name;
        this.designation = designation;
        this.element = element;
        this.ability = ability;
        this.status = status;
        this.belong_to = belong_to;
        this.power_score = power_score;
        this.power_rank = power_rank;
        this.spirit_score = spirit_score;
        this.spirit_rank = spirit_rank;
        this.agility_score = agility_score;
        this.agility_rank = agility_rank;
        this.endurance_score = endurance_score;
        this.endurance_rank = endurance_rank;
        this.defense_score = defense_score;
        this.defense_rank = defense_rank;
        this.toughness_score = toughness_score;
        this.toughness_rank = toughness_rank;
        this.total_score = total_score;
        this.total_rank = total_rank;
        this.created_time = created_time;
        this.created_by = created_by;
        this.updated_time = updated_time;
        this.updated_by = updated_by;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation () {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBelong_to() {
        return belong_to;
    }

    public void setBelong_to(String belong_to) {
        this.belong_to = belong_to;
    }

    public int getPower_score() {
        return power_score;
    }

    public void setPower_score(int power_score) {
        this.power_score = power_score;
    }

    public String getPower_rank() {
        return power_rank;
    }

    public void setPower_rank(String power_rank) {
        this.power_rank = power_rank;
    }

    public int getSpirit_score() {
        return spirit_score;
    }

    public void setSpirit_score(int spirit_score) {
        this.spirit_score = spirit_score;
    }

    public String getSpirit_rank() {
        return spirit_rank;
    }

    public void setSpirit_rank(String spirit_rank) {
        this.spirit_rank = spirit_rank;
    }

    public int getAgility_score() {
        return agility_score;
    }

    public void setAgility_score(int agility_score) {
        this.agility_score = agility_score;
    }

    public String getAgility_rank() {
        return agility_rank;
    }

    public void setAgility_rank(String agility_rank) {
        this.agility_rank = agility_rank;
    }

    public int getEndurance_score() {
        return endurance_score;
    }

    public void setEndurance_score(int endurance_score) {
        this.endurance_score = endurance_score;
    }

    public String getEndurance_rank() {
        return endurance_rank;
    }

    public void setEndurance_rank(String endurance_rank) {
        this.endurance_rank = endurance_rank;
    }

    public int getDefense_score() {
        return defense_score;
    }

    public void setDefense_score(int defense_score) {
        this.defense_score = defense_score;
    }

    public String getDefense_rank() {
        return defense_rank;
    }

    public void setDefense_rank(String defense_rank) {
        this.defense_rank = defense_rank;
    }

    public int getToughness_score() {
        return toughness_score;
    }

    public void setToughness_score(int toughness_score) {
        this.toughness_score = toughness_score;
    }

    public String getToughness_rank() {
        return toughness_rank;
    }

    public void setToughness_rank(String toughness_rank) {
        this.toughness_rank = toughness_rank;
    }

    public int getTotal_score() {
        return total_score;
    }

    public void setTotal_score(int total_score) {
        this.total_score = total_score;
    }

    public String getTotal_rank() {
        return total_rank;
    }

    public void setTotal_rank(String total_rank) {
        this.total_rank = total_rank;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    @Override
    public String toString() {
        return "Legend [uuid=" + uuid + ", name=" + name + ", designation=" + designation + ", element=" + element + ", ability=" + ability + ", status=" + status + ", belong_to=" + belong_to + ", power_score=" + power_score + ", power_rank=" + power_rank + ", spirit_score=" + spirit_score + ", spirit_rank=" + spirit_rank + ", agility_score=" + agility_score + ", agility_rank=" + agility_rank + ", endurance_score=" + endurance_score + ", endurance_rank=" + endurance_rank + ", defense_score=" + defense_score + ", defense_rank=" + defense_rank + ", toughness_score=" + toughness_score + ", toughness_rank=" + toughness_rank + ", total_score=" + total_score + ", total_rank=" + total_rank + ", created_time=" + created_time + ", created_by=" + created_by + ", updated_time=" + updated_time + ", updated_by=" + updated_by + "]";
    }
}
