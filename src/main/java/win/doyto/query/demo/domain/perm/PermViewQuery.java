package win.doyto.query.demo.domain.perm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import win.doyto.query.core.PageQuery;
import win.doyto.query.core.RelationalQuery;

/**
 * PermViewQuery
 *
 * @author f0rb on 2022/10/26
 * @since 1.0.0
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PermViewQuery extends PageQuery implements RelationalQuery<PermView, Integer> {

    private String permName;

    @Override
    public Class<PermView> getDomainClass() {
        return PermView.class;
    }
}