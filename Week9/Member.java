package member;
public class Member {
    private String name;
    private String memberId;
    public Member(String name, String memberId) {
        if (name == null || name.isEmpty() || memberId == null || memberId.isEmpty()) {
            throw new IllegalArgumentException("Name and member ID cannot be null or empty.");
        }
        this.name = name;
        this.memberId = memberId;
    }
    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }
}

