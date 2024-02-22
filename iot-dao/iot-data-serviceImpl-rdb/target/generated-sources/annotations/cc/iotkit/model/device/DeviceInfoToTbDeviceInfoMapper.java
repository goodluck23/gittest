package cc.iotkit.model.device;

import cc.iotkit.data.model.TbDeviceInfo;
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
public interface DeviceInfoToTbDeviceInfoMapper extends BaseMapper<DeviceInfo, TbDeviceInfo> {
  @Mapping(
      target = "state",
      ignore = true,
      source = "state"
  )
  TbDeviceInfo convert(DeviceInfo source);

  @Mapping(
      target = "state",
      ignore = true,
      source = "state"
  )
  TbDeviceInfo convert(DeviceInfo source, @MappingTarget TbDeviceInfo target);
}
