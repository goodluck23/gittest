package cc.iotkit.data.model;

import cc.iotkit.model.ota.DeviceOtaInfo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbDeviceOtaInfoToDeviceOtaInfoMapper extends BaseMapper<TbDeviceOtaInfo, DeviceOtaInfo> {
}
