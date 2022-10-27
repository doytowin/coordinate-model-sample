package win.doyto.query.demo.domain.user;

import lombok.Getter;
import lombok.Setter;
import win.doyto.query.annotation.DomainPath;
import win.doyto.query.demo.domain.perm.PermView;
import win.doyto.query.demo.domain.role.RoleView;
import win.doyto.query.entity.Persistable;

import java.util.List;
import javax.persistence.Id;

/**
 * UserView
 *
 * @author f0rb on 2022/10/26
 * @since 1.0.0
 */
@Getter
@Setter
public class UserView implements Persistable<Long> {
    @Id
    private Long id;
    private String username;
   
    // many-to-many
    @DomainPath({"user", "role"})
    private List<RoleView> roles;
   
    // many-to-many
    @DomainPath({"user", "role", "perm"})
    private List<PermView> perms;
}