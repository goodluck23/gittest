package cc.iotkit.model.ota;

import cc.iotkit.data.model.TbDeviceOtaDetail;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface DeviceOtaDetailToTbDeviceOtaDetailMapper extends BaseMapper<DeviceOtaDetail, TbDeviceOtaDetail> {
}
