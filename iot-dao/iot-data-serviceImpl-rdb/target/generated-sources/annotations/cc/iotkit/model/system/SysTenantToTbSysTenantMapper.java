package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysTenant;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysTenantToTbSysTenantMapper extends BaseMapper<SysTenant, TbSysTenant> {
}
