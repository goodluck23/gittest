package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysNotice;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysNoticeToTbSysNoticeMapper extends BaseMapper<SysNotice, TbSysNotice> {
}
