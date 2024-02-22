package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysMenu;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysMenuToTbSysMenuMapper extends BaseMapper<SysMenu, TbSysMenu> {
}
