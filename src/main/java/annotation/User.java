package annotation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Getter
    private final UserId id;
    @Getter
    private final UserName name;
    @Getter
    private final Address address;
}
