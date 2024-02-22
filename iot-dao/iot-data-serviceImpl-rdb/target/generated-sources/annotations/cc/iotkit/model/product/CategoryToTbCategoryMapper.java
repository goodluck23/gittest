package cc.iotkit.model.product;

import cc.iotkit.data.model.TbCategory;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CategoryToTbCategoryMapper extends BaseMapper<Category, TbCategory> {
}
