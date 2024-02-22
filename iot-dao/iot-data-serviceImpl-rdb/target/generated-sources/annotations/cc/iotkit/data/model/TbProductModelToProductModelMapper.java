package cc.iotkit.data.model;

import cc.iotkit.model.product.ProductModel;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TbProductModelToProductModelMapper extends BaseMapper<TbProductModel, ProductModel> {
}
