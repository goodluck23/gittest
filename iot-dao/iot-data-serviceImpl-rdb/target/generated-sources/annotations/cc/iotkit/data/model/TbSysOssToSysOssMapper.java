package cc.iotkit.data.model;

import cc.iotkit.model.system.SysOss;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbSysOssToSysOssMapper extends BaseMapper<TbSysOss, SysOss> {
}
