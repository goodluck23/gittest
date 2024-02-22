package cc.iotkit.model.rule;

import cc.iotkit.data.model.TbRuleInfo;
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
public interface RuleInfoToTbRuleInfoMapper extends BaseMapper<RuleInfo, TbRuleInfo> {
  @Mapping(
      target = "listeners",
      ignore = true,
      source = "listeners"
  )
  @Mapping(
      target = "filters",
      ignore = true,
      source = "filters"
  )
  @Mapping(
      target = "actions",
      ignore = true,
      source = "actions"
  )
  TbRuleInfo convert(RuleInfo source);

  @Mapping(
      target = "listeners",
      ignore = true,
      source = "listeners"
  )
  @Mapping(
      target = "filters",
      ignore = true,
      source = "filters"
  )
  @Mapping(
      target = "actions",
      ignore = true,
      source = "actions"
  )
  TbRuleInfo convert(RuleInfo source, @MappingTarget TbRuleInfo target);
}
