package hello.hellospring.domain;

/**
 * packageName    : hello.hellospring.domain
 * fileName       : Member
 * author         : men16
 * date           : 2022-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-05        men16       최초 생성
 */
public class Member {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
