package cc.iotkit.model;

import cc.iotkit.data.model.TbUserInfo;
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
public interface UserInfoToTbUserInfoMapper extends BaseMapper<UserInfo, TbUserInfo> {
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
  TbUserInfo convert(UserInfo source);

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
  TbUserInfo convert(UserInfo source, @MappingTarget TbUserInfo target);
}
