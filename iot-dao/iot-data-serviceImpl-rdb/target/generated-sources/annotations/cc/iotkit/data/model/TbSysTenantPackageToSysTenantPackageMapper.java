package cc.iotkit.data.model;

import cc.iotkit.model.system.SysTenantPackage;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbSysTenantPackageToSysTenantPackageMapper extends BaseMapper<TbSysTenantPackage, SysTenantPackage> {
}
