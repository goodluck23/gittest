package cc.iotkit.data.model;

import cc.iotkit.model.ota.DeviceOtaDetail;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbDeviceOtaDetailToDeviceOtaDetailMapper extends BaseMapper<TbDeviceOtaDetail, DeviceOtaDetail> {
}
