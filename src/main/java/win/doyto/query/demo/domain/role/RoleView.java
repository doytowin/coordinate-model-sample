package win.doyto.query.demo.domain.role;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.entity.Persistable;

import javax.persistence.Id;

/**
 * RoleView
 *
 * @author f0rb on 2022/10/26
 */
@Getter
@Setter
public class RoleView implements Persistable<Integer> {
    @Id
    private Integer id;
    private String roleName;
    private Boolean valid;
}
