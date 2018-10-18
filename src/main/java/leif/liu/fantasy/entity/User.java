package leif.liu.fantasy.entity;

public class User {
    private String uuid;
    private String username;
    private String password;
    private String nickname;
    private String created_time;
    private String created_by;
    private String updated_time;
    private String updated_by;

    public User() {}

    public User(String uuid, String username, String password, String nickname, String created_time, String created_by, String updated_time, String updated_by) {
        this.uuid = uuid;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
        return "User [uuid=" + uuid + ", username=" + username + ", password=" + password + ", nickname=" + nickname + ", created_time=" + created_time + ", created_by=" + created_by + ", updated_time=" + updated_time + ", updated_by=" + updated_by + "]";
    }
}
