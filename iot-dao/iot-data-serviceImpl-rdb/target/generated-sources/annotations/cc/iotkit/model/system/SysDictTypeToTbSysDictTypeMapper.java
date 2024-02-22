package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysDictType;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictTypeToTbSysDictTypeMapper extends BaseMapper<SysDictType, TbSysDictType> {
}
