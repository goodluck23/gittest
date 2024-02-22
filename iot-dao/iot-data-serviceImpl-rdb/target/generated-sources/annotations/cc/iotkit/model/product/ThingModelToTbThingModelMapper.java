package cc.iotkit.model.product;

import cc.iotkit.data.model.TbThingModel;
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
public interface ThingModelToTbThingModelMapper extends BaseMapper<ThingModel, TbThingModel> {
  @Mapping(
      target = "model",
      ignore = true,
      source = "model"
  )
  TbThingModel convert(ThingModel source);

  @Mapping(
      target = "model",
      ignore = true,
      source = "model"
  )
  TbThingModel convert(ThingModel source, @MappingTarget TbThingModel target);
}
