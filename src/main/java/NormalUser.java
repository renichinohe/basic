import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
public class NormalUser {
    @Getter
    private final NormalUserId normalUserId;
    @Getter
    private final NormalUserName normalUserName;
    @Getter
    private final NormalAddress normalAddress;

    public String toString() {
        return "User(" + "id=" + normalUserId + ", name=" + normalUserName + ", address=" + normalAddress + ')';
    }
}
