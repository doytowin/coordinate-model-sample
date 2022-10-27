package win.doyto.query.demo.mongodb.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import win.doyto.query.core.PageQuery;
import win.doyto.query.core.RelationalQuery;

/**
 * RoleViewQuery
 *
 * @author f0rb on 2022/10/26
 * @since 1.0.0
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RoleViewQuery extends PageQuery implements RelationalQuery<RoleView, Integer> {

    private String roleName;

    @Override
    public Class<RoleView> getDomainClass() {
        return RoleView.class;
    }
}