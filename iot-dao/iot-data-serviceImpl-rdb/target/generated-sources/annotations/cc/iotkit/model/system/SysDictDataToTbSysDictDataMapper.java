package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysDictData;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictDataToTbSysDictDataMapper extends BaseMapper<SysDictData, TbSysDictData> {
}
