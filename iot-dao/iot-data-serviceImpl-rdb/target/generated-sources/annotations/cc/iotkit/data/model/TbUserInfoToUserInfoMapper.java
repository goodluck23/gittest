package cc.iotkit.data.model;

import cc.iotkit.model.UserInfo;
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
public interface TbUserInfoToUserInfoMapper extends BaseMapper<TbUserInfo, UserInfo> {
  @Mapping(
      target = "roles",
      ignore = true,
      source = "roles"
  )
  @Mapping(
      target = "permissions",
      ignore = true,
      source = "permissions"
  )
  @Mapping(
      target = "usePlatforms",
      ignore = true,
      source = "usePlatforms"
  )
  UserInfo convert(TbUserInfo source);

  @Mapping(
      target = "roles",
      ignore = true,
      source = "roles"
  )
  @Mapping(
      target = "permissions",
      ignore = true,
      source = "permissions"
  )
  @Mapping(
      target = "usePlatforms",
      ignore = true,
      source = "usePlatforms"
  )
  UserInfo convert(TbUserInfo source, @MappingTarget UserInfo target);
}
