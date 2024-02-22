package cc.iotkit.data.model;

import cc.iotkit.model.rule.RuleInfo;
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
public interface TbRuleInfoToRuleInfoMapper extends BaseMapper<TbRuleInfo, RuleInfo> {
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
  RuleInfo convert(TbRuleInfo source);

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
  RuleInfo convert(TbRuleInfo source, @MappingTarget RuleInfo target);
}
