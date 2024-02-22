package cc.iotkit.model.product;

import cc.iotkit.data.model.TbProduct;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ProductToTbProductMapper extends BaseMapper<Product, TbProduct> {
}
