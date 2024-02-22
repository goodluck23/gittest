package cc.iotkit.data.model;

import cc.iotkit.model.device.DeviceInfo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbDeviceInfoToDeviceInfoMapper extends BaseMapper<TbDeviceInfo, DeviceInfo> {
  @Mapping(
      target = "state",
      ignore = true,
      source = "state"
  )
  DeviceInfo convert(TbDeviceInfo source);

  @Mapping(
      target = "state",
      ignore = true,
      source = "state"
  )
  DeviceInfo convert(TbDeviceInfo source, @MappingTarget DeviceInfo target);
}
