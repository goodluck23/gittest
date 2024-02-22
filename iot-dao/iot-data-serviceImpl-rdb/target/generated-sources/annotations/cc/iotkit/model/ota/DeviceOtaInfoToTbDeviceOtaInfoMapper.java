package cc.iotkit.model.ota;

import cc.iotkit.data.model.TbDeviceOtaInfo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DeviceOtaInfoToTbDeviceOtaInfoMapper extends BaseMapper<DeviceOtaInfo, TbDeviceOtaInfo> {
}
