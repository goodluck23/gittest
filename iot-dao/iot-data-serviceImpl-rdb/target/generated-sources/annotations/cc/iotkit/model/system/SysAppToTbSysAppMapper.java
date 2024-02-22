package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysApp;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysAppToTbSysAppMapper extends BaseMapper<SysApp, TbSysApp> {
}
