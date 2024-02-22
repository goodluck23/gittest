package cc.iotkit.data.model;

import cc.iotkit.model.product.ThingModel;
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
public interface TbThingModelToThingModelMapper extends BaseMapper<TbThingModel, ThingModel> {
  @Mapping(
      target = "model",
      ignore = true,
      source = "model"
  )
  ThingModel convert(TbThingModel source);

  @Mapping(
      target = "model",
      ignore = true,
      source = "model"
  )
  ThingModel convert(TbThingModel source, @MappingTarget ThingModel target);
}
