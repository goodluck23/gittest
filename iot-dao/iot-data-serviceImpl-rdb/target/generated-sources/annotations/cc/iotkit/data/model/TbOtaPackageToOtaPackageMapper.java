package cc.iotkit.data.model;

import cc.iotkit.model.ota.OtaPackage;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbOtaPackageToOtaPackageMapper extends BaseMapper<TbOtaPackage, OtaPackage> {
}
