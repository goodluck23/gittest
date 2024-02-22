package cc.iotkit.data.model;

import cc.iotkit.model.product.Category;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbCategoryToCategoryMapper extends BaseMapper<TbCategory, Category> {
}
